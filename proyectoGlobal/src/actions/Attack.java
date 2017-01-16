package actions;

public class Attack extends CharacterAction {
	
	public Attack() {
		this.action = "Attack";
		this.decorator = "";
	}
	
	@Override
	public int quantity() {
		return 0;
	}
}
