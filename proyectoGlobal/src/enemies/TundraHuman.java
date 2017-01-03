package enemies;

public class TundraHuman extends Human {
	public TundraHuman() {
		super();
		this.setName("TundraHuman");
		
		this.setAttackValue(this.getAttackValue() - 3);
		this.setDefenseValue(this.getDefenseValue() + 3);
		}
}
