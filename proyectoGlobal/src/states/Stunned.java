package states;
import character.Character;

public class Stunned implements CharacterState {
	
	Character character;
	
	public Stunned(Character character) {
		// TODO Auto-generated constructor stub
		this.character = character;
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		if(character.isStunned()){
			character.setCurrentState(character.getStunned());
		}
	}
}
