package actions;


public abstract class EnemyAction {
	//TODO: Change to int (this should be renamed)
	protected abstract int quantity();
	
	public final void completeAction(){
		action();
	}
	
	protected abstract void action();
	
	
}
