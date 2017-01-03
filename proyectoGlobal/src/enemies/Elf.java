package enemies;

public abstract class Elf extends Enemy {
	
	public Elf(){
		super();
		this.setName("Elf");
		this.setHealthValue(90);
		this.setHealthMaxValue(90);
		this.setAttackValue(7);
		this.setDefenseValue(13);
		this.setStaminaValue(60);
		this.setStaminaMaxValue(60);
	}
	

}
