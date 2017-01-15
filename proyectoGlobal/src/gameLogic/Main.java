package gameLogic;

import java.util.Scanner;

import character.Character;
import player.Player;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the best game ever!");

		Player player = new Player();
		player.setPlayerValues(scanner);
		
		System.out.println("\nPREPARE FOR BATTLE!\n");
		@SuppressWarnings("unused")
		ManageBattle manageBattle = new ManageBattle(player, scanner);
		
		System.out.println("Your final score is: " + player.getScore());
		
		scanner.close();
	}
	
	public void showStats(Character character){
		System.out.println(character.getAttackValue());
		System.out.println(character.getDefenseValue());
		System.out.println(character.getHealthValue());
		System.out.println(character.getStaminaValue());
	}

}
