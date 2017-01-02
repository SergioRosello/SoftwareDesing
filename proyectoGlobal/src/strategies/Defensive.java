package strategies;
import enemies.*;

public class Defensive implements Strategy {
	
	Enemy enemy;
	public Defensive(){
		enemy.setAttackRange(3);
		enemy.setDefenseRange(7);
	}
}
