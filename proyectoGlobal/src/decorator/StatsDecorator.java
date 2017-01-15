package decorator;
import actions.*;

public abstract class StatsDecorator extends CharacterAction {

	public CharacterAction characterAction;
	
	int decoratorValue;
}