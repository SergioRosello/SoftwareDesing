package enemies;

import gameLogic.EnvirenomentSelection;

public class EnemySpawn {

	private EnemyFactory enemyFactory;
	private EnvirenomentSelection envirenomentSelection;
	
	public EnemySpawn(){
		envirenomentSelection = new EnvirenomentSelection();
		this.enemyFactory = envirenomentSelection.selectEnemyLocation();
	}
	
	//Decide que enemigo crear basándose en una semilla aleatoria.
	public Enemy createEnemy(){
		this.enemyFactory = envirenomentSelection.selectEnemyLocation();
		//Genera un número aleatorio entre 0 y 2.
		int randomEnemy = (int)(Math.random() * (2 + 1));
		if(randomEnemy == 0)return enemyFactory.createElf();
		else if(randomEnemy == 1)return enemyFactory.createHuman();
		else return enemyFactory.createOrc();
	}
	
	public void setEnemyFactory(EnemyFactory enemyFactory){
		this.enemyFactory = enemyFactory;
	}
}
