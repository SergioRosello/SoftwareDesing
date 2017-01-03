package actions;

import character.Character;

public class Defense extends CharacterAction {

	public Defense(){
		proceedWithAction();
	}

	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void prepareAction() {
		// TODO Auto-generated method stub
		
	}

	
	//No vamos a usar estos dos métodos en esta clase.
	@Override
	protected Character quantity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Character removeStat() {
		// TODO Auto-generated method stub
		return null;
	}

}
