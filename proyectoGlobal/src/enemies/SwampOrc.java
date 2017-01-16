package enemies;


public class SwampOrc extends Orc {

	public SwampOrc(){
		super();
		this.setName("SwampOrc");
		this.setDefenseValue(this.getDefenseValue() - 2);
		this.setStaminaValue(this.getStaminaValue() + 5);
		this.setStaminaMaxValue(this.getStaminaMaxValue() + 5);
	}

}
