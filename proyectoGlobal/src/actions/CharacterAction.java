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
	
	public final void proceedWithAction(){
		prepareAction();
		action();
		endAction();
	}

	
}
