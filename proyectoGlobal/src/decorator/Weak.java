package decorator;

import actions.CharacterAction;
import character.Character;

public class Weak extends StatsDecorator {

	public Weak(CharacterAction characterAction) {
		this.characterAction = characterAction;
	}

	@Override
	public int quantity() {
		return characterAction.quantity();
	}

	
	//Estos dos métodos no los vamos a usar en esta clase.
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
		
	}


}
