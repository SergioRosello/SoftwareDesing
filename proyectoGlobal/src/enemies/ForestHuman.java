package enemies;
public class ForestHuman extends Human {
	public ForestHuman() {
		super();
		this.setName("ForestHuman");
		
		this.setHealthValue(this.getHealthValue() + 10);
		this.setHealthMaxValue(this.getHealthMaxValue() + 10);
		this.setAttackValue(this.getAttackValue() -2);
		}
}
