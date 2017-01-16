package strategies;

import actions.Attack;
import actions.CharacterAction;
import actions.Defense;
import actions.Rest;

public abstract class Strategy {

	int attackRange = 0;
	int defenseRange= 0;

	public final CharacterAction chooseAction(int stamina, int health){
		boolean againstTheRopes = false;
		
		againstTheRopes = chooseLife(stamina, health);
		if(againstTheRopes){
			return new Rest();
		}else{
			return choose(stamina);
		}
	};
	
	private final CharacterAction choose(int stamina){
		//Hacemos el random, tenemos en cuenta los rangos y stamina, elegimos una acción.
		int randomAction = (int)(Math.random() * (10 + 1));

		if (randomAction >= 0 && randomAction < attackRange && stamina >= 10) {
			return new Attack();
		} else if(stamina >= 5) {
			return new Defense();
		} 
		else return new Rest();	
	}

	boolean chooseLife(int stamina, int health){
		return false;
	};
}