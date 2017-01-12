package decorator;

import actions.CharacterAction;
import character.Character;

public class Strong extends StatsDecorator{

	
	public Strong(CharacterAction characterAction){
		this.characterAction = characterAction;
	}
	
	@Override
	public int quantity() {
		return characterAction.quantity();
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
