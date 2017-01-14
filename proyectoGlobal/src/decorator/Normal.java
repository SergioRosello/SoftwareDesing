package decorator;
import actions.CharacterAction;

public class Normal extends StatsDecorator {

	public Normal(CharacterAction characterAction){
		this.characterAction = characterAction;
	}
	
	//Como el decorator es "normal" no va a alterar las caracter�sticas del "character" 
	//Por tanto, devolvemos el character sin m�s.
	@Override
	public int quantity() {
		return characterAction.quantity();
	}
	
	//Estos dos m�todos no los vamos a usar en esta clase.
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
		
	}
	
}
