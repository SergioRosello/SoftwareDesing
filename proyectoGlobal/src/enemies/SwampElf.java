package enemies;
public class SwampElf extends Elf {
	public SwampElf() {
		super();
		this.setName("SwampElf");
		this.setDefenseValue(this.getDefenseValue() - 2);
		this.setStaminaValue(this.getStaminaValue() + 5);
		this.setStaminaMaxValue(this.getStaminaMaxValue() + 5);
	}
}
