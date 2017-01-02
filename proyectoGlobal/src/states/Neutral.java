package states;
import character.Character;

public class Neutral implements CharacterState {

	Character character;
	
	public Neutral(Character character) {
		// TODO Auto-generated constructor stub
		this.character = character;
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		if(character.isStunned()){
			character.setCurrentState(character.getStunned());
		}
		else if(character.isDamaged()){
			character.setCurrentState(character.getDamaged());
		}
		else{
			character.setCurrentState(character.getNeutral());
		}
	}
}
