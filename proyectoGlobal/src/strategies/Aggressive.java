package strategies;

import enemies.Enemy;

public class Aggressive implements Strategy {

	Enemy enemy;
	public Aggressive() {
		enemy.setAttackRange(7);
		enemy.setDefenseRange(3);
	}
}
