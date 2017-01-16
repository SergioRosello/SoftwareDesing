package actions;


public class Rest extends CharacterAction{

	public Rest(){
		this.action = "Rest";
		this.decorator = "";
	}
	
	@Override
	public int quantity() {
		return 0;
	}

}
