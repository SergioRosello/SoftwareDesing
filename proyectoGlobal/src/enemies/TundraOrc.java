package enemies;

public class TundraOrc extends Orc {
	public TundraOrc() {
		super();
		this.setName("TundraOrc");
		
		this.setAttackValue(this.getAttackValue() - 3);
		this.setDefenseValue(this.getDefenseValue() + 3);
		}
}
