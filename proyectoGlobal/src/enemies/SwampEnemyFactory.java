package enemies;

public class SwampEnemyFactory implements EnemyFactory {

	@Override
	public Orc createOrc() {
		return new SwampOrc();
	}

	@Override
	public Elf createElf() {
		return new SwampElf();
	}

	@Override
	public Human createHuman() {
		return new SwampHuman();
	}
}
