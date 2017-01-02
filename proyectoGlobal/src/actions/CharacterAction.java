package actions;


public abstract class CharacterAction {
	//TODO: Change to int (this should be renamed)
	protected abstract int quantity();
	
	public final void proceedWithAction(){
		action();
	}
	
	protected abstract void action();
	
	
}
