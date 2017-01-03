package enemies;

public class ForestElf extends Elf {
	public ForestElf() {
		super();
		this.setName("ForestElf");
		
		this.setHealthValue(this.getHealthValue() + 10);
		this.setHealthMaxValue(this.getHealthMaxValue() + 10);
		this.setAttackValue(this.getAttackValue() -2);
	}

}
