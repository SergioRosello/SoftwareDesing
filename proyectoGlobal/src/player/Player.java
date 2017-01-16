package player;
import java.util.Scanner;

import actions.Attack;
import actions.Defense;
import actions.Rest;
import character.Character;

public class Player extends Character{
	int score = 0;
	Scanner scanner;
	public Player(Scanner scanner) {
		this.scanner = scanner;
		resetStats();
	}
	
	private void resetStats(){
		setName("Player");
		setHealthValue(10);
		setHealthMaxValue(10);
		setStaminaValue(10);
		setStaminaMaxValue(10);
		setAttackValue(1);
		setDefenseValue(1);
	}
	
	public void setPlayerValues(){
		int healthPoints;
		int staminaPoints;
		int strengthPoints;
		int defensePoints;
		boolean finalized = false;
		boolean correctStats = false;
		while(!correctStats){
			finalized = false;
			resetStats();
			do {
				System.out.println("You have 40 points!\nDistribute them as you wish");
				System.out.println("You can assign points to your health, stamina, strength and defense");
				do {
					System.out.println("How many points do you want to assign to your health? (each point counts as 10 HP)");
					healthPoints = scanner.nextInt();
					if(healthPoints <= 40) setHealthValue(healthPoints * 10);
				} while (healthPoints > 40);
				System.out.println("You have " + (40 - healthPoints) + " points left");
				
				do {
					System.out.println("How many points do you want to assign to your Stamina? (each point counts as 10 SP)");
					staminaPoints = scanner.nextInt();
					if((healthPoints + staminaPoints) < 40)setStaminaValue(staminaPoints * 10);
				} while (healthPoints + staminaPoints > 40);
				System.out.println("You have " + (40 - healthPoints - staminaPoints) + " points left");

				
				do {
					System.out.println("How many points do you want to assign to your Strength? (each point counts as 1 SP)");
					strengthPoints = scanner.nextInt();
					if((healthPoints + strengthPoints) < 40)setAttackValue(strengthPoints);
				} while (healthPoints + staminaPoints + strengthPoints> 40);
				System.out.println("You have " + (40 - healthPoints - staminaPoints - strengthPoints) + " points left");

				
				do {
					System.out.println("How many points do you want to assign to your Defense? (each point counts as 1 DP)");
					defensePoints = scanner.nextInt();
					if((healthPoints + defensePoints) < 40)setDefenseValue(defensePoints);
				} while (healthPoints + staminaPoints + strengthPoints + defensePoints > 40);
				System.out.println("You have " + (40 - healthPoints - staminaPoints - strengthPoints - defensePoints) + " points left");
				
				if((healthPoints + staminaPoints + strengthPoints + defensePoints) <= 40){
					finalized = true;
				}else{
					System.out.println("You are far to greedy... Lets start over ;)");
				}
			} while (!finalized);
			
			System.out.println("Your stats are:");
			System.out.println("Health -> " + getHealthValue());
			System.out.println("Stamina ->" + getStaminaValue());
			System.out.println("Strength -> " + getAttackValue());
			System.out.println("Defense -> " + getDefenseValue());
			System.out.println("Are you happy with them? (type 1 for Yes and 0 for No)");
			int resultado = scanner.nextInt();
			if(resultado == 1){
				setHealthMaxValue(getHealthValue());
				setStaminaMaxValue(getStaminaValue());
				correctStats = true;
			}
		}
	}

	@Override
	public void executeCurrentAction() {
		assignPlayerAction();
		this.applyDecorator();
	}

	//Aquí asignamos la current action al player. 
	private void assignPlayerAction(){
		int playerAction = 0;
		do{
			playerAction = askPlayerForAction();
			
			if(playerAction == 1){
				this.currentAction = new Attack();
			}
			else if(playerAction == 2){
				this.currentAction = new Defense();
			}
			else if(playerAction == 3){
				this.currentAction = new Rest();
			}
			else if(playerAction == 4){
				showTutorial();
			}
			else if(playerAction == 5){
				this.setHealthValue(0);
			}
		}while(playerAction == 4);
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
					if(this.getStaminaValue() >= 10){
						validAction = true;
					}else System.out.println("Not enough stamina.");
				}
				else if(action == 2){
					if(this.getStaminaValue() >= 5){
						validAction = true;
					}else System.out.println("Not enough stamina.");
				}
				else validAction = true;
			}
		}while(!validAction);
		return action;
	}
	
	private void showTutorial(){
		System.out.println("This game is a turn-based game. You choose an action and execute it, ");
		System.out.println("your enemy chooses an action (based in his strategy) and executes it.");
		System.out.println("Every action consumes stamina.");
		System.out.println("Depending on your action, you can attack to hurt your enemy,");
		System.out.println("defend to receive less damage or rest to heal yourself, regain stamina");
		System.out.println("and heal from status effects.");
		System.out.println("If you get stunned, you loose a turn.");
		System.out.println("If you are damaged, you will loose health each turn.");
		System.out.println("Good luck\n");
	}
	

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
}
