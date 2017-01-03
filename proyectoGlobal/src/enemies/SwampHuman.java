package enemies;

public class SwampHuman extends Human {
	public SwampHuman() {
		super();
		this.setName("SwampHuman");
 		
		this.setDefenseValue(this.getDefenseValue() - 2);
		this.setStaminaValue(this.getStaminaValue() + 5);
		this.setStaminaMaxValue(this.getStaminaMaxValue() + 5);
	}
}
