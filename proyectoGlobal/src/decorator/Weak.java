package decorator;
import actions.CharacterAction;

public class Weak extends StatsDecorator {

	public Weak(CharacterAction characterAction) {
		this.characterAction = characterAction;
		this.action = characterAction.action;
		this.decorator = "Weak";
	}

	@Override
	public int quantity() {
		decoratorValue = 5;
		return characterAction.quantity() - decoratorValue;
	}
}
