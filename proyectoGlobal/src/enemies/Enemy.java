package enemies;
import character.Character;
import decorator.Normal;
import decorator.Strong;
import decorator.Weak;
import strategies.Aggressive;
import strategies.Defensive;
import strategies.Strategy;

public abstract class Enemy extends Character{
	
	Strategy strategy;
	
	public Enemy(){
		super();
		this.setName("Enemy");
		setStrategy();
	}
	
	protected void setStrategy(){
		int randomStrategy = (int)Math.random() * 2;
		
		if(randomStrategy == 0) this.strategy = new Aggressive();
		else this.strategy = new Defensive();
	}
	
	protected void executeCurrentAction(){
		strategy.chooseAction();
		applyDecorator();
	}
}


