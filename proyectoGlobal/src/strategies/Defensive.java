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
	/*
	 * El enemigo se va a encargar de aplicar el decorator que le toque segun la stamina que tenga
	 * La estrategia se encarga de elegir la acci�n y de ejecutarla. (Son los dos clientes)
	 * en principio: 			enemy.currentAction.proceedWithAction();          lo tiene que hacer la calculadora :/
	 */
	@Override
	public void chooseAction(){
			//Hacer el random, tener en cuenta los rangos y stamina, elegir una acci�n.
			//TODO: hace falta acabar esto
			int randomAction = (int)Math.random() * 10;
			
			if (enemy.getStaminaValue() > 0) {
				if (randomAction >= 0 && randomAction < enemy.getAttackRange()) {
					enemy.currentAction = new Attack();
				} else {
					enemy.currentAction = new Defense();
				} 
			}
			else {
				enemy.currentAction = new Rest();
			}
	}
}
