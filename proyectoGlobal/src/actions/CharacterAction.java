package actions;
import character.Character;

public abstract class CharacterAction extends Character{
	//TODO: Change to int (this should be renamed)
	protected abstract Character quantity();
	
	protected abstract Character removeStat();
	
	protected abstract void action();
	
	protected abstract void prepareAction();
	
	protected abstract void endAction();
	
	public final void proceedWithAction(){
		//Comprobar el decorator que va a utilizar
		prepareAction();
		//Realizar el ataque
		action();
		//Quitar el decorator
		//Quitar stamina
		endAction();
	}

	
}
