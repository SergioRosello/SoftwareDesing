package states;
import character.Character;

public class Stunned implements CharacterState {
	
	Character character;
	
	public Stunned(Character character) {
		// TODO Auto-generated constructor stub
		this.character = character;
	}

	@Override
	public void setStunned() {
		character.setCurrentState(character.getCharacterStateStunned());
	}

	@Override
	public void setNeutral() {
		character.setCurrentState(character.getCharacterStateNeutral());
	}

	@Override
	public void setDamaged() {
		character.setCurrentState(character.getCharacterStateDamaged());
	}
}
