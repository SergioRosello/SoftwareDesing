package enemies;

public class ForestOrc extends Orc {
	public ForestOrc() {
		super();
		this.setName("ForestOrc");
		
		this.setHealthValue(this.getHealthValue() + 10);
		this.setHealthMaxValue(this.getHealthMaxValue() + 10);
		this.setAttackValue(this.getAttackValue() -2);
		}
}
