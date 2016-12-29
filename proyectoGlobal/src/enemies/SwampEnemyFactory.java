package enemies;

public class SwampEnemyFactory implements EnemyFactory {

	@Override
	public Orc createOrc() {
		// TODO Auto-generated method stub
		return new SwampOrc();
	}

	@Override
	public Elf createElf() {
		// TODO Auto-generated method stub
		return new SwampElf();
	}

	@Override
	public Human createHuman() {
		// TODO Auto-generated method stub
		return new SwampHuman();
	}

}
