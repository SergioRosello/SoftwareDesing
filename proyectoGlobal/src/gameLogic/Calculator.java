package gameLogic;

import enemies.Enemy;
import player.Player;

//Calculates attack results.
public class Calculator {

	private static Calculator uniqueInstance;
	
	public static Calculator getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new Calculator();
			return uniqueInstance;
			}
		return uniqueInstance;
	}

	public void manage(Player player, Enemy enemy) {
		
	}
	
	public void manage(Enemy enemy, Player player) {
		
	}
}
