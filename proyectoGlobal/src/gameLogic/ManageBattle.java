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
	Scanner scanner;
	
	public ManageBattle(Player player, Scanner scanner) {
		// TODO Auto-generated constructor stub
		enemySpawn = new EnemySpawn();
		calculator = Calculator.getInstance();
		this.player = player;
		this.scanner = scanner;
		recursiveManageBattle();
	}
	
	private void recursiveManageBattle(){
		while(player.getHealthValue() > 0){
			//Creamos un enemigo
			enemy = enemySpawn.createEnemy();
			System.out.println("\n-----------NEW BATTLE-----------\n");
			System.out.println("Your next oponent is a " + enemy.getName());
			System.out.println("A coin will decide who goes first. ");
			//Se tira una moneda
			int moneda = (int)(Math.random() * (1 + 1));
			
			if(moneda == 0){
				System.out.println("Player starts first");
				playerManageBattle();
			}else{
				System.out.println(enemy.getName() + " starts first");
				enemyManageBattle();
			}			
		}
	}

	//Esta es la funcion de la batalla si el enemigo gana el tiro de moneda.
	private void enemyManageBattle() {
		while(enemy.getHealthValue() > 0 && player.getHealthValue() > 0){
			System.out.println("-----------ENEMY TURN-----------");
			if(enemy.getCurrentState() != enemy.getCharacterStateStunned()){
				enemy.executeCurrentAction();
				calculator.manage(enemy,  player);
			}else {
				System.out.println("The enemy is stunned and cant do anything this turn");
				enemy.getCurrentState().setNeutral();
			}
			
			System.out.println("-----------PLAYER TURN-----------");
			if(player.getCurrentState() != player.getCharacterStateStunned()){
				assignPlayerAction();
				if(player.getHealthValue() > 0){
					player.applyDecorator();
					calculator.manage(player, enemy);
				}
			} else {
				System.out.println("You are stunned, wait for your next turn");
				player.getCurrentState().setNeutral();
			}
		}
		endBattle();
	}

	//Esta es la funcion de la batalla si el player gana el tiro de moneda.
	private void playerManageBattle() {
		while(enemy.getHealthValue() > 0 && player.getHealthValue() > 0){
			System.out.println("-----------PLAYER TURN-----------");
			if(player.getCurrentState() != player.getCharacterStateStunned()){
				assignPlayerAction();
				if(player.getHealthValue() > 0){
					player.applyDecorator();
					calculator.manage(player, enemy);
				}
			} else {
				System.out.println("You are stunned, wait for your next turn");
				player.getCurrentState().setNeutral();
			}
			
			System.out.println("-----------ENEMY TURN-----------");
			if(enemy.getCurrentState() != enemy.getCharacterStateStunned()){
				enemy.executeCurrentAction();
				calculator.manage(enemy,  player);
			}else {
				System.out.println("The enemy is stunned and cant do anything this turn");
				enemy.getCurrentState().setNeutral();
			}
		}
		endBattle();
	}

	//Aquí le pedimos por pantalla una acción al player y nos aseguramos que es posible realizarla.
	private int askPlayerForAction(){
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
					}else System.out.println("Not enough stamina.");
				}
				else if(action == 2){
					if(player.getStaminaValue() >= 5){
						validAction = true;
					}else System.out.println("Not enough stamina.");
				}
				else validAction = true;
			}
		}while(!validAction);
		return action;
	}
	
	//TODO falta acabar
	private void showTutorial(){
		System.out.println("This game is a turn-based game. You choose an action\nand your enemy chooses an action. (based in his strategy)");
		System.out.println("Every action consumes stamina.");
		System.out.println("Depending on your action, you can attack to hurt your enemy,\ndefend to receive less damage or rest to heal yourself and regain stamina.");
		System.out.println("");
	}
	
	//Aquí asignamos la current action al player. 
	private void assignPlayerAction(){
		int playerAction = 0;
		do{
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
		}while(playerAction == 4);
	}

	private void endBattle(){
		if(player.getHealthValue() <= 0){
			System.out.println("You have been defeated.");
		}else if(enemy.getHealthValue() <= 0){
			System.out.println("Congratulations, you defeated your enemy!\nPrepare for the next battle.");
			player.setScore(player.getScore() + 100);
			recursiveManageBattle();
		}
	}
}