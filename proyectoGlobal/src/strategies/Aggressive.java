package strategies;

import actions.*;
import enemies.Enemy;

public class Aggressive implements Strategy {

	Enemy enemy;
	CharacterAction action;
	public Aggressive() {
		enemy.setAttackRange(7);
		enemy.setDefenseRange(3);
	}
	
	@Override
	public void chooseAction(){
			//Hacer el random, tener en cuenta los rangos y stamina, elegir una acción.
			//TODO: hace falta acabar esto
			int randomAction = (int)Math.random() * 10;
			
			if (enemy.getStaminaValue() > 0) {
				if (randomAction >= 0 && randomAction < enemy.getAttackRange()) {
					enemy.currentAction = new Attack();
					enemy.currentAction.proceedWithAction();
				} else {
					enemy.currentAction = new Defense();
					enemy.currentAction.proceedWithAction();
				} 
			}
			else {
				enemy.currentAction = new Rest();
				enemy.currentAction.proceedWithAction();
			}
	}
}
