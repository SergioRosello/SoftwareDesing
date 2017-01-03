package decorator;

import actions.CharacterAction;
import character.Character;

public class Weak extends StatsDecorator {

	
	Character character;
	CharacterAction currentAction;
	
	public Weak(Character character) {
		this.character = character;
		this.character.currentAction = character.currentAction;
	}

	@Override
	protected Character quantity() {
		if(currentAction.toString() == "Attack") character.setAttackValue(character.getAttackValue() - 10);
		else if(currentAction.toString() == "Defense") character.setDefenseValue(character.getDefenseValue() - 10);
		return character;
	}

	@Override
	protected Character removeStat() {
		// TODO Auto-generated method stub
		return this.character;
	}

	
	//Estos dos métodos no los vamos a usar en esta clase.
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void prepareAction() {
		// TODO Auto-generated method stub
		
	}


}
