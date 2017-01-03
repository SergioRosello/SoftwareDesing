package enemies;
public abstract class Orc extends Enemy {

	public Orc(){
		super();
		this.setName("Orc");
		this.setHealthValue(110);
		this.setHealthMaxValue(110);
		this.setAttackValue(15);
		this.setDefenseValue(7);
		this.setStaminaValue(40);
		this.setStaminaMaxValue(40);
	}
}
