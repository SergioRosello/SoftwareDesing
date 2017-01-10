package decorator;

import actions.CharacterAction;
import character.Character;

public class Strong extends StatsDecorator{

	Character character;
	
	public Strong(CharacterAction characterAction){
		this.characterAction = characterAction;
	}
	
	@Override
	public int quantity() {
		return characterAction.quantity();
	}

	@Override
	protected Character removeStat() {
		if(characterAction.toString() == "Attack") character.setAttackValue(character.getAttackValue() - 10);
		else if(characterAction.toString() == "Defense") character.setDefenseValue(character.getDefenseValue() - 10);
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
