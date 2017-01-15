package player;
import java.util.Scanner;

import character.Character;

public class Player extends Character{
	int score = 0;

	public Player() {
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
	
	public void setPlayerValues(Scanner scanner){
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

	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
