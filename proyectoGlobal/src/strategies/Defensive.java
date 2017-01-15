package strategies;
import actions.Attack;
import actions.CharacterAction;
import actions.Defense;
import actions.Rest;
public class Defensive extends Strategy {

	public Defensive() {
		attackRange = 3;
		defenseRange = 7;
	}
	
	@Override
	public CharacterAction chooseAction(int stamina){
		//Hacer el random, tener en cuenta los rangos y stamina, elegir una acción.
		//TODO: hace falta acabar esto
		int randomAction = (int)Math.random() * 10;
		
		if (randomAction >= 0 && randomAction < attackRange && stamina >= 10) {
			return new Attack();
		} else if(stamina >= 5) {
			return new Defense();
		} 
		else return new Rest();
			
	}
}
