package strategies;

public class Defensive extends Strategy {

	public Defensive() {
		attackRange = 3;
		defenseRange = 7;
	}
	
	@Override
	boolean chooseLife(int stamina, int health){
		if(health <= 30 && stamina <= 15){
			return true;
		}
		return false;
	}
}
