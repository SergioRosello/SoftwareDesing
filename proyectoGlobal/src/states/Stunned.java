package states;
import character.Character;

public class Stunned implements CharacterState {
	
	Character character;
	
	public Stunned(Character character) {
		this.character = character;
	}
	
	private void setNeutral() {
		character.setCurrentState(character.getCharacterStateNeutral());
		character.setStunned(false);
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
		}else if(character.isNeutral()){
			setNeutral();
		}
	}
}
