package actions;
import character.Character;

public class Defense extends CharacterAction {

	Character character;
	CharacterAction currentAction;
	
	public Defense(){
		this.action = "Defense";
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
	
	
	//No vamos a usar estos dos métodos en esta clase.
	@Override
	public int quantity() {
		// TODO Auto-generated method stub
		return 0;
	}

}
