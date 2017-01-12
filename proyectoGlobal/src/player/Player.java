package player;
import java.util.Scanner;

import character.Character;

public class Player extends Character{
	int score = 0;
	
	public Player() {
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
		Scanner scanner = new Scanner(System.in);
		while(!correctStats){
			System.out.println("You have 40 points!\nDistribute them as you wish");
			System.out.println("You can assign points to your health, stamina, strength and defense");
			do {
				do {
					System.out.println("How many points do you want to assign to your health? (each point counts as 10 HP)");
					healthPoints = scanner.nextInt();
					if(healthPoints <= 40) setHealthValue(healthPoints);
				} while (healthPoints > 40);
				System.out.println("You have " + (40 - healthPoints) + "left");
				
				do {
					System.out.println("How many points do you want to assign to your Stamina? (each point counts as 10 SP)");
					staminaPoints = scanner.nextInt();
					if((healthPoints + staminaPoints) < 40)setStaminaValue(staminaPoints);
				} while (healthPoints + staminaPoints > 40);
				System.out.println("You have " + (40 - healthPoints - staminaPoints) + "left");

				
				do {
					System.out.println("How many points do you want to assign to your Strength? (each point counts as 1 SP)");
					strengthPoints = scanner.nextInt();
					if((healthPoints + strengthPoints) < 40)setAttackValue(strengthPoints);
				} while (healthPoints + staminaPoints + strengthPoints> 40);
				System.out.println("You have " + (40 - healthPoints - staminaPoints - strengthPoints) + "left");

				
				do {
					System.out.println("How many points do you want to assign to your Defense? (each point counts as 1 DP)");
					defensePoints = scanner.nextInt();
					if((healthPoints + defensePoints) < 40)setDefenseValue(defensePoints);
				} while (healthPoints + staminaPoints + strengthPoints + defensePoints > 40);
				System.out.println("You have " + (40 - healthPoints - staminaPoints - strengthPoints - defensePoints) + "left");
				
				finalized = true;
				
			} while ((healthPoints + staminaPoints + strengthPoints + defensePoints) < 40 || !finalized);
			
			System.out.println("Your stats are:");
			System.out.println("Health -> " + getHealthValue());
			System.out.println("Stamina ->" + getStaminaValue());
			System.out.println("Strength -> " + getAttackValue());
			System.out.println("Defense -> " + getDefenseValue());
			System.out.println("Are you happy with them? (type 'yes' or 'no')");
			if(scanner.nextLine().equals("yes")){
				setHealthMaxValue(getHealthValue());
				setStaminaMaxValue(getStaminaValue());
				correctStats = true;
			}
		}
		scanner.close();
	}
}
