package enemies;
public class TundraElf extends Elf {
	public TundraElf() {
		super();
		this.setName("TundraElf");
		
		this.setAttackValue(this.getAttackValue() - 3);
		this.setDefenseValue(this.getDefenseValue() + 3);
	}
}
