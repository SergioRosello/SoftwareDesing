package enemies;
public abstract class Human extends Enemy {
	
	public Human(){
		super();
		this.setName("Human");
		this.setHealthValue(100);
		this.setHealthMaxValue(100);
		this.setAttackValue(10);
		this.setDefenseValue(10);
		this.setStaminaValue(50);
		this.setStaminaMaxValue(50);
	}
}
