package enemies;

public class EnemySpawn {

	private EnemyFactory enemyFactory;
	
	public EnemySpawn(EnemyFactory enemyFactory){
		this.enemyFactory = enemyFactory;
	}
	
	//Decide que enemigo crear bas�ndose en una semilla aleatoria.
	public void createEnemy(){
		//Genera un n�mero aleatorio entre 0 y 2.
		int randomEnemy = (int)Math.random() * 3;
		if(randomEnemy == 0)enemyFactory.createElf();
		else if(randomEnemy == 1) enemyFactory.createHuman();
		else enemyFactory.createOrc();
	}
	
	public void setEnemyFactory(EnemyFactory enemyFactory){
		this.enemyFactory = enemyFactory;
	}
}
