package gameLogic;

import enemies.Enemy;
import enemies.EnemySpawn;
import player.Player;
import character.Character;

public class BattleManager {
	
	Calculator calculator;
	EnemySpawn enemySpawn;
	Player player;
	Enemy enemy;
	Character turno;
	
	public BattleManager(Player player) {
		enemySpawn = new EnemySpawn();
		calculator = Calculator.getInstance();
		this.player = player;
	}
	
	public void battleStructure(){
		while(player.getHealthValue() > 0){
			
			//Creamos un enemigo
			enemy = enemySpawn.createEnemy();
			
			System.out.println("\n-----------NEW BATTLE-----------\n");
			System.out.println("Your next oponent is a " + enemy.getName());
			System.out.println("A coin will decide who goes first. ");
			
			//Se tira una moneda
			int moneda = (int)(Math.random() * (1 + 1));
			if(moneda == 0){
				turno = player;
			}else{
				turno = enemy;
			}	
			System.out.println(turno.getName() + " starts first\n");
			while(player.getHealthValue() > 0 && enemy.getHealthValue() > 0){
				battle(turno);
			}
			endBattle();
		}
	}

	private Character getOppositeCharacter(){
		if(turno.getName().equals("Player")){
			return enemy;
		}else return player;
	}
	
	private void battle(Character character){
		System.out.println("----------- " + character.getName() + " TURN -----------");
		if(character.getCurrentState() != character.getCharacterStateStunned()){
			//Aquí se ejecuta la acción del character.
			character.executeCurrentAction();
			//Si el character sigue vivo, se llama a el calculator para aplicar la acción escogida.
			if(turno.getHealthValue() > 0){
				calculator.manage(turno,  getOppositeCharacter());
			}
		}else {
			//Si el character está stuneado, no puede hacer nada y vuelve a su estado neutral.
			System.out.println(turno.getName() + " is stunned and cant do anything this turn");
			turno.getCurrentState().setNeutral();
		}
		
		//Re-asignamos el turno a quien le toque
		turno = getOppositeCharacter();
	}
	
	private void endBattle(){
		if(player.getHealthValue() <= 0){
			System.out.println("You have been defeated.");
		}else if(enemy.getHealthValue() <= 0){
			System.out.println("Congratulations, you defeated your enemy!\nPrepare for the next battle.");
			player.setScore(player.getScore() + 100);			
		}	
	}
}