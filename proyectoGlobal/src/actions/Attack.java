package actions;

public class Attack extends CharacterAction {


	CharacterAction characterAction;
	
	public Attack() {
		this.action = "Attack";
		this.decorator = "";
	}
	

	
	@Override
	protected void action() {
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
	}
	
	
	//Estos dos m�todos no vamos a usarlos en esta clase.
	@Override
	public int quantity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
