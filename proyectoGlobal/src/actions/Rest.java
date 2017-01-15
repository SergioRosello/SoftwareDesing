package actions;


public class Rest extends CharacterAction{

	public Rest(){
		this.action = "Rest";
		this.decorator = "";
	}
	
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
	}
	
	
	

	//Estas dos clases no las vamos a usar en esta clase.
	@Override
	public int quantity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
