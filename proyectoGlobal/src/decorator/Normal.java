package decorator;
import actions.CharacterAction;

public class Normal extends StatsDecorator {

	public Normal(CharacterAction characterAction){
		this.characterAction = characterAction;
	}
	
	//Como el decorator es "normal" no va a alterar las características del "character" 
	//Por tanto, devolvemos el character sin más.
	@Override
	public int quantity() {
		return characterAction.quantity();
	}
	
	//Estos dos métodos no los vamos a usar en esta clase.
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
		
	}
	
}
