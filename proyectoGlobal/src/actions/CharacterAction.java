package actions;
import character.Character;

public abstract class CharacterAction {
	//TODO: Change to int (this should be renamed)
	protected abstract Character quantity();
	
	protected abstract Character removeStat();
	
	protected abstract void action();
	
	protected abstract void prepareAction();
	
	protected void endAction(){
		removeStat();
	};
	
	private final CharacterAction chooseAction(Character character){
		if(character.getName() != "Player"){
			//Hacer el random, tener en cuenta los rangos y stamina, elegir una acción.
			//TODO: hace falta acabar esto
			int randomAction = (int)Math.random() * 10;
			if(randomAction >= 0 && randomAction < character.getAttackRange()) {
				return null;
			}
		}
		else return null;//Gestionar las entradas por consola del usuario. (el pleyer es libre de decidir estrategia)
	}
	public final void proceedWithAction(){
		prepareAction();
		action();
		endAction();
	}

	
}
