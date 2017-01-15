package actions;

public abstract class CharacterAction {
	//TODO: Change to int (this should be renamed)
	
	public int val;
	public String action;
	public String decorator;
	
	public abstract int quantity();
	
	//protected abstract Character removeStat();
	
	protected abstract void action();
	
	//protected abstract void prepareAction();
	
	protected abstract void endAction();
	
	public final void proceedWithAction(){
		//Realizar el ataque
		action();
		endAction();
	}

	
}
