

public abstract class EnemyAction {
	//TODO: Change to int (this should not be a method)
	abstract int quantity();
	
	public final void completeAction(){
		action();
	}
	
	abstract void action();
	
	
}
