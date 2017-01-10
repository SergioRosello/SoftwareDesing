package actions;

import character.Character;

public class Rest extends CharacterAction{

	public Rest(){
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

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
		removeStat();
	}
	
	
	

	//Estas dos clases no las vamos a usar en esta clase.
	@Override
	public int quantity() {
		// TODO Auto-generated method stub
		return val;
	}

	@Override
	protected Character removeStat() {
		// TODO Auto-generated method stub
		return null;
	}
}
