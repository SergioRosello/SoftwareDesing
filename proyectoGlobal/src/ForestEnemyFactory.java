
public class ForestEnemyFactory implements EnemyFactory {

	@Override
	public Orc createOrc() {
		// TODO Auto-generated method stub
		return new ForestOrc();
	}

	@Override
	public Elf createElf() {
		// TODO Auto-generated method stub
		return new ForestElf();
	}

	@Override
	public Human createHuman() {
		// TODO Auto-generated method stub
		return new ForestHuman();
	}

}
