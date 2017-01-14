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

	//TODO aqui tenemos en cuenta cuando se aplican los estados y si le hace daño algun estado
	//tambien tenemos en cuenta los decoratos (todo lo que incimbe hacer calculo de vida y stamina)
	//Gestiona la accion del player sobre el enemigo
	public void manage(Player player, Enemy enemy) {
		
	}
	//Sobrecarga del método superior
	//Gestiona la accion del enemigo sobre el player
	public void manage(Enemy enemy, Player player) {
		
	}
}
