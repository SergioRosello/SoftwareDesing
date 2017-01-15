package strategies;

import actions.*;

public class Aggressive extends Strategy {

	public Aggressive() {
		attackRange = 7;
		defenseRange = 3;
	}
	
	@Override
	public CharacterAction chooseAction(int stamina){
		//Hacer el random, tener en cuenta los rangos y stamina, elegir una acción.
		//TODO: hace falta acabar esto
		int randomAction = (int)(Math.random() * (10 + 1));

		
		if (randomAction >= 0 && randomAction < attackRange && stamina >= 10) {
			return new Attack();
		} else if(stamina >= 5) {
			return new Defense();
		} 
		else return new Rest();
			
	}
}
