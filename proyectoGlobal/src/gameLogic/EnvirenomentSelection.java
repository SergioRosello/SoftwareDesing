package gameLogic;

import enemies.*;

public class EnvirenomentSelection {

	EnemyFactory enemyFactory;
	EnemySpawn enemySpawn;
	
	//Decides the enemy's location based on a random seed
	void selectEnemyLocation(){
		int randomEnemyLocation = (int)Math.random() * 3;
		if(randomEnemyLocation == 0)enemyFactory = new ForestEnemyFactory();
		else if(randomEnemyLocation == 1) enemyFactory = new TundraEnemyFactory();
		else enemyFactory = new SwampEnemyFactory();
		
		enemySpawn.setEnemyFactory(enemyFactory);
	}
}
