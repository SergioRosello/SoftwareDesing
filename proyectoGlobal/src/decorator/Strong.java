package decorator;

import actions.CharacterAction;
import character.Character;

public class Strong extends StatsDecorator{

	Character character;
	CharacterAction currentAction;
	
	public Strong(Character character){
		this.character = character;
		this.currentAction = character.currentAction;
	}
	
	@Override
	protected Character quantity() {
		if(currentAction.toString() == "Attack") character.setAttackValue(character.getAttackValue() + 10);
		else if(currentAction.toString() == "Defense") character.setDefenseValue(character.getDefenseValue() + 10);
		return character;
	}

	@Override
	protected Character removeStat() {
		if(currentAction.toString() == "Attack") character.setAttackValue(character.getAttackValue() - 10);
		else if(currentAction.toString() == "Defense") character.setDefenseValue(character.getDefenseValue() - 10);
		return character;
	}
	
	

	//Estos dos métodos no los vamos a usar en esta clase.
	@Override
	protected void prepareAction() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
		
	}		
}
