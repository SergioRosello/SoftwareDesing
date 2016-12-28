
public class TundraEnemyFactory implements EnemyFactory {

	@Override
	public Orc createOrc() {
		// TODO Auto-generated method stub
		return new TundraOrc();
	}

	@Override
	public Elf createElf() {
		// TODO Auto-generated method stub
		return new TundraElf();
	}

	@Override
	public Human createHuman() {
		// TODO Auto-generated method stub
		return new TundraHuman();
	}

}
