package character;
import states.*;

public abstract class Character {

	//Common variables
	String name;
	int healthValue; 
	int attackValue;
	int defenseValue;
	int staminaValue;
	int staminaMaxValue;
	boolean stunned;
	public CharacterState currentState;
	
	//Possible character states.
	CharacterState Neutral;
	CharacterState Damaged;
	CharacterState Stunned; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthValue() {
		return healthValue;
	}

	public void setHealthValue(int healthValue) {
		this.healthValue = healthValue;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}

	public int getDefenseValue() {
		return defenseValue;
	}

	public void setDefenseValue(int defenseValue) {
		this.defenseValue = defenseValue;
	}

	public int getStaminaValue() {
		return staminaValue;
	}

	public void setStaminaValue(int staminaValue) {
		this.staminaValue = staminaValue;
	}

	public int getStaminaMaxValue() {
		return staminaMaxValue;
	}

	public void setStaminaMaxValue(int staminaMaxValue) {
		this.staminaMaxValue = staminaMaxValue;
	}

	public boolean isStunned() {
		return stunned;
	}

	public void setStunned(boolean stunned) {
		this.stunned = stunned;
	}

	public CharacterState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(CharacterState currentState) {
		this.currentState = currentState;
	}

	public CharacterState getNeutral() {
		return Neutral;
	}

	public void setNeutral(CharacterState neutral) {
		Neutral = neutral;
	}

	public CharacterState getDamaged() {
		return Damaged;
	}

	public void setDamaged(CharacterState damaged) {
		Damaged = damaged;
	}

	public CharacterState getStunned() {
		return Stunned;
	}

	public void setStunned(CharacterState stunned) {
		Stunned = stunned;
	}

	//Sets the state of the character
	void setState(CharacterState state) {
		this.currentState = state;
	}
}