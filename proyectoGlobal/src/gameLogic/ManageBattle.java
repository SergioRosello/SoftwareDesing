package gameLogic;

import enemies.Enemy;
import enemies.EnemySpawn;
import player.Player;

import java.util.Scanner;

import actions.Attack;
import actions.Defense;
import actions.Rest;

public class ManageBattle {
	//Gestiona el bucle interon de la batalla, no de la partida.
	
	Calculator calculator;
	EnemySpawn enemySpawn;
	Player player;
	Enemy enemy;
	
	public ManageBattle(Player player) {
		// TODO Auto-generated constructor stub
		enemySpawn = new EnemySpawn();
		calculator = new Calculator();
		this.player = player;
		recursiveManageBattle();
	}
	
	private void recursiveManageBattle(){
		while(player.getHealthValue() > 0){
			//Creamos un enemigo
			enemy = enemySpawn.createEnemy();
			System.out.println("Your next oponent is a " + enemy.getName());
			
			//Se tira una moneda
			int moneda = (int)Math.random() * 1 + 1;
			
			if(moneda == 0){
				playerManageBattle();
			}else enemyManageBattle();
			
		}
	}
	
	private void enemyManageBattle() {
		int playerAction;
		while(enemy.getHealthValue() > 0 && player.getHealthValue() > 0){
			if(!enemy.isStunned()){
				enemy.executeCurrentAction();
				calculator.manage(enemy,  player);
			}else System.out.println("The enemy is stunned and cant do anything this turn");
			
			if(!player.isStunned()){
				playerAction = askPlayerForAction();
				if(playerAction == 1){
					player.currentAction = new Attack();
				}
				else if(playerAction == 2){
					player.currentAction = new Defense();
				}
				else if(playerAction == 3){
					player.currentAction = new Rest();
				}
				else if(playerAction == 4){
					showTutorial();
				}
				else if(playerAction == 5){
					player.setHealthValue(0);
				}
				player.applyDecorator();
				calculator.manage(player, enemy);
			} else System.out.println("You are stunned, wait for your next turn");
		}
	}

	private void playerManageBattle() {
		int playerAction;
		while(enemy.getHealthValue() > 0 && player.getHealthValue() > 0){
			if(!player.isStunned()){
				playerAction = askPlayerForAction();
				if(playerAction == 1){
					player.currentAction = new Attack();
				}
				else if(playerAction == 2){
					player.currentAction = new Defense();
				}
				else if(playerAction == 3){
					player.currentAction = new Rest();
				}
				else if(playerAction == 4){
					showTutorial();
				}
				else if(playerAction == 5){
					player.setHealthValue(0);
				}
				player.applyDecorator();
				calculator.manage(player, enemy);
			} else System.out.println("You are stunned, wait for your next turn");
			
			if(!enemy.isStunned()){
				enemy.executeCurrentAction();
				calculator.manage(enemy,  player);
			}else System.out.println("The enemy is stunned and cant do anything this turn");
		}
	}

	private int askPlayerForAction(){
		Scanner scanner = new Scanner(System.in);
		int action;
		boolean validAction = false;
		do{
			System.out.println("What do you want to do?");
			System.out.println("1. Attack\n2. Defend\n3. Rest\n4. Info\n5. Concede");
			action = scanner.nextInt();
			if(action <= 5 && action >= 1){
				if(action == 1){
					if(player.getStaminaValue() >= 10){
						validAction = true;
					}
				}
				else if(action == 2){
					if(player.getStaminaValue() >= 5){
						validAction = true;
					}
				}
				else validAction = true;
			}
		}while(!validAction);
		scanner.close();
		return action;
	}
	
	//TODO falta acabar
	private void showTutorial(){
		System.out.println("This game is a turn-based game. You choose an action, your enemy chooses an action. (based in his strategy)");
		System.out.println("Every action consumes stamina.");
		System.out.println("Depending on your action, you can attack to hurt your enemy, defend to receive less damage or rest to heal yourself and regain stamina.");
		System.out.println("");
	}
}
