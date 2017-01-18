package states;
import character.Character;

public class Neutral implements CharacterState {

	Character character;
	
	public Neutral(Character character) {
		this.character = character;
	}

	private void setStunned() {
		character.setCurrentState(character.getCharacterStateStunned());
		character.setNeutral(false);
		character.setDamaged(false);
	}

	private void setDamaged() {
		character.setCurrentState(character.getCharacterStateDamaged());
		character.setNeutral(false);
		character.setStunned(false);
	}

	@Override
	public void handle() {
		if(character.isDamaged()){
			setDamaged();
		}else if(character.isStunned()){
			setStunned();
		}
	}
	
}
