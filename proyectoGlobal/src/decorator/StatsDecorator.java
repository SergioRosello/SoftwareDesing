package decorator;
import actions.*;

public abstract class StatsDecorator extends CharacterAction {

	CharacterAction characterAction;
	
	int decoratorValue;
}