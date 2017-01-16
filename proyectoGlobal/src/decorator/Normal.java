package decorator;
import actions.CharacterAction;

public class Normal extends StatsDecorator {

	public Normal(CharacterAction characterAction){
		this.characterAction = characterAction;
		this.action = characterAction.action;
		this.decorator = "Normal";
	}
	
	@Override
	public int quantity() {
		return characterAction.quantity();
	}
}
