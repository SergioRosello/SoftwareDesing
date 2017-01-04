package strategies;
import actions.Attack;
import actions.Defense;
import actions.Rest;
import enemies.*;

public class Defensive implements Strategy {
	
	Enemy enemy;
	public Defensive(){
		enemy.setAttackRange(3);
		enemy.setDefenseRange(7);
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
