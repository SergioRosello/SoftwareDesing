package enemies;

public class TundraEnemyFactory implements EnemyFactory {

	@Override
	public Orc createOrc() {
		return new TundraOrc();
	}

	@Override
	public Elf createElf() {
		return new TundraElf();
	}

	@Override
	public Human createHuman() {
		return new TundraHuman();
	}
}
