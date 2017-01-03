package actions;

import character.Character;

public class Attack extends CharacterAction {


	 public Attack() {
		 proceedWithAction();
	}
	
	
	@Override
	protected void prepareAction() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	
	//Estos dos métodos no vamos a usarlos en esta clase.
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
