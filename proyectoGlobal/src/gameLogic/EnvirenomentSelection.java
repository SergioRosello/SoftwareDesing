package gameLogic;

import enemies.*;

public class EnvirenomentSelection {

	EnemyFactory enemyFactory;
	
	//Decides the enemy's location based on a random seed
	public EnemyFactory selectEnemyLocation(){
		int randomEnemyLocation = (int)(Math.random() * (2 + 1));
		if(randomEnemyLocation == 0)enemyFactory = new ForestEnemyFactory();
		else if(randomEnemyLocation == 1) enemyFactory = new TundraEnemyFactory();
		else enemyFactory = new SwampEnemyFactory();
		
		return enemyFactory;
	}
}