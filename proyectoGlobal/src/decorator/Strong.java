package decorator;

import actions.CharacterAction;
import enemies.Enemy;

public class Strong extends StatsDecorator{

	Enemy enemy;
	CharacterAction currentAction;
	
	public Strong(Enemy enemy){
		this.enemy = enemy;
		this.currentAction = enemy.currentAction;
	}
	
	@Override
	//Falta cambiar el tipo de dato que devielve a "character"
	protected int quantity() {
		// TODO Auto-generated method stub
		if(currentAction.toString() == "Attack") enemy.setAttackValue(enemy.getAttackValue()+10);
		else if(currentAction.toString() == "Defense") enemy.setDefenseValue(enemy.getDefenseValue() + 10);
		return 0;
	}

	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	//falta hacer el método para poder dejar al personaje como estaba.

}
