package gameLogic;

import character.Character;
import player.Player;

public class Main {

	public static void main(String[] args) {
		
		
		
		System.out.println("Welcome to the best game ever!");

		Player player = new Player();
		player.setPlayerValues();
		
		System.out.println("\nPREPARE FOR BATTLE!\n");
		ManageBattle manageBattle = new ManageBattle(player);
	}
	
	public void showStats(Character character){
		System.out.println(character.getAttackValue());
		System.out.println(character.getDefenseValue());
		System.out.println(character.getHealthValue());
		System.out.println(character.getStaminaValue());
	}

}
