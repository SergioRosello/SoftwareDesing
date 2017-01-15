package decorator;
import actions.CharacterAction;

public class Strong extends StatsDecorator{

	
	public Strong(CharacterAction characterAction){
		this.characterAction = characterAction;
		this.action = characterAction.action;
		this.decorator = "Strong";
	}
	
	@Override
	public int quantity() {
		decoratorValue = 5;
		return characterAction.quantity() + decoratorValue;
	}
	

	
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
		
	}		
}
