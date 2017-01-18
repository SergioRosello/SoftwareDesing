package states;
import character.Character;

public class Damaged implements CharacterState {
	
	Character character;
	
	public Damaged(Character character) {
		this.character = character;
	}

	
	private void setStunned() {
		character.setCurrentState(character.getCharacterStateStunned());
		character.setNeutral(false);
		character.setDamaged(false);
	}

	private void setNeutral() {
		character.setCurrentState(character.getCharacterStateNeutral());
		character.setDamaged(false);
		character.setStunned(false);
	}

	@Override
	public void handle() {
		if(character.isNeutral()){
			setNeutral();
		}else if(character.isStunned()){
			setStunned();
		}
	}
	
	
}