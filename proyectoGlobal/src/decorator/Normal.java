package decorator;

import actions.CharacterAction;
import character.Character;

public class Normal extends StatsDecorator {

	Character character;
	CharacterAction currentAction;
	
	public Normal(Character character){
		this.character = character;
		this.character.currentAction = character.currentAction;
	}
	
	//Como el decorator es "normal" no va a alterar las características del "character" 
	//Por tanto, devolvemos el character sin más.
	@Override
	protected Character quantity() {
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
