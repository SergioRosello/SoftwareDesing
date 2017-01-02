package character;
import actions.CharacterAction;
import states.*;

public abstract class Character {

	//Common variables
	String name;
	int healthValue; 
	//To prevent the character from having more life that it starts with.
	int healthMaxValue;
	int attackValue;
	int defenseValue;
	int staminaValue;
	//To prevent the character from having more stamina that it starts with.
	int staminaMaxValue;
	boolean stunned;
	boolean damaged;
	boolean neutral;
	public CharacterState currentState;
	public CharacterAction currentAction;
	
	//Possible character states.
	CharacterState Neutral;
	CharacterState Damaged;
	CharacterState Stunned; 
	

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getHealthValue() {return healthValue;}
	public void setHealthValue(int healthValue) {this.healthValue = healthValue;}
	public int getAttackValue() {return attackValue;}
	public void setAttackValue(int attackValue) {this.attackValue = attackValue;}
	public int getDefenseValue() {return defenseValue;}
	public void setDefenseValue(int defenseValue) {this.defenseValue = defenseValue;}
	public int getStaminaValue() {return staminaValue;}
	public void setStaminaValue(int staminaValue) {this.staminaValue = staminaValue;}
	public int getStaminaMaxValue() {return staminaMaxValue;}
	public void setStaminaMaxValue(int staminaMaxValue) {this.staminaMaxValue = staminaMaxValue;}
	public boolean isStunned() {return stunned;}
	public boolean isDamaged(){return damaged;}
	public boolean isNeutral(){return neutral;}
	public void setStunned(boolean stunned) {this.stunned = stunned;}
	public void setDamaged(boolean damaged) {this.damaged = damaged;}
	public void setNeutral(boolean neutral) {this.neutral = neutral;}
	public CharacterState getCurrentState() {return currentState;}
	public void setCurrentState(CharacterState currentState) {this.currentState = currentState;}
	public void setNeutral(CharacterState neutral) {Neutral = neutral;}
	public void setDamaged(CharacterState damaged) {Damaged = damaged;}
	public void setStunned(CharacterState stunned) {Stunned = stunned;}
	//Sets the state of the character
	void setState(CharacterState state) {this.currentState = state;}
	public CharacterState getStunned() {return Stunned;}
	public CharacterState getNeutral() {return Neutral;}
	public CharacterState getDamaged() {return Damaged;}
	public int getHealthMaxValue() {return healthMaxValue;}
	public void setHealthMaxValue(int healthMaxValue) {this.healthMaxValue = healthMaxValue;}
	public CharacterAction getCurrentAction() {return currentAction;}
	public void setCurrentAction(CharacterAction currentAction) {this.currentAction = currentAction;}
}