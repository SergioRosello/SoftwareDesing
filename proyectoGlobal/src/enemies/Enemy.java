package enemies;
import character.Character;
import strategies.Aggressive;
import strategies.Defensive;
import strategies.Strategy;

public abstract class Enemy extends Character{
	
	Strategy strategy;
	
	//Para poder elejir el comportamiento del enemigo
	//según una estrategia, tenemos que tener un rango
	//La suma de los dos valores del rango va a ser el rango completo.
	//El rango completo va a ser de 10
	int attackRange = 5;
	int defenseRange = 5;
	public int getAttackRange() {
		return attackRange;
	}
	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	public int getDefenseRange() {
		return defenseRange;
	}
	public void setDefenseRange(int defenseRange) {
		this.defenseRange = defenseRange;
	}
	
	protected void setStrategy(){
		int randomStrategy = (int)Math.random() * 2;
		
		if(randomStrategy == 0) this.strategy = new Aggressive();
		else this.strategy = new Defensive();
	}
}
