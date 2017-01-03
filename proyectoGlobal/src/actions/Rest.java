package actions;

import character.Character;

public class Rest extends CharacterAction{

	public Rest(){
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

	//Estas dos clases no las vamos a usar en esta clase.
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
