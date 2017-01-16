package gameLogic;

import java.util.Scanner;
import player.Player;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the best game ever!");

		Player player = new Player(scanner);
		player.setPlayerValues();
		
		System.out.println("\nPREPARE FOR BATTLE!\n");
		BattleManager manageBattle = new BattleManager(player);
		manageBattle.battleStructure();
		
		System.out.println("Your final score is: " + player.getScore());
		
		scanner.close();
	}
}
