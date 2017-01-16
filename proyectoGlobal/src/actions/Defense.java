package actions;

public class Defense extends CharacterAction {
	
	public Defense(){
		this.action = "Defense";
		this.decorator = "";
	}
	
	@Override
	public int quantity() {
		return 0;
	}

}
