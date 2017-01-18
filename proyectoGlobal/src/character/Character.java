package character;
import actions.CharacterAction;
import actions.Rest;
import decorator.Normal;
import decorator.Strong;
import decorator.Weak;
import states.*;

public abstract class Character {
	
	public Character(){
		name = "Character";
		healthValue = 0;
		healthMaxValue = 0;
		attackValue = 0;
		defenseValue = 0;
		staminaValue = 0;
		staminaMaxValue = 0;
		isStunned = false;
		isDamaged = false;
		isNeutral = true;
		stunned = new Stunned(this);
		neutral = new Neutral(this);
		damaged = new Damaged(this);
		currentState = neutral;
		currentAction = new Rest();
	}

	//Common variables
	String name;
	int healthValue; 
	int healthMaxValue;	//To prevent the character from having more life that it starts with.
	int attackValue;
	int defenseValue;
	int staminaValue;
	int staminaMaxValue;	//To prevent the character from having more stamina that it starts with. isStunned;

	//Booleans for state management
	boolean isNeutral;
	boolean isDamaged;
	boolean isStunned;
	

	public CharacterState currentState;
	public CharacterAction currentAction;
	
	//Possible character states.
	CharacterState neutral;
	CharacterState damaged;
	CharacterState stunned; 
	
	//Methods
	public void applyDecorator() {
		//Fuerte
		if(staminaValue <= staminaMaxValue && staminaValue >= (staminaMaxValue/3 * 2)){
			currentAction = new Strong(currentAction);
		}
		//Normal
		else if(staminaValue <= (staminaMaxValue/3 * 2) && staminaValue >= (staminaMaxValue/3)){
			currentAction = new Normal(currentAction);
		}
		//Debil
		else{
			currentAction = new Weak(currentAction);
		}
	}
	
	//Ejecuta la acción actual del Character.
	public abstract void executeCurrentAction();
	

	//Getters and Setters
	public String getName() 									{return name;}
	public void setName(String name) 							{this.name = name;}
	public int getHealthValue() 								{return healthValue;}
	public void setHealthValue(int healthValue) 				{this.healthValue = healthValue;}
	public int getHealthMaxValue() 								{return healthMaxValue;}
	public void setHealthMaxValue(int healthMaxValue) 			{this.healthMaxValue = healthMaxValue;}
	public int getAttackValue() 								{return attackValue;}
	public void setAttackValue(int attackValue) 				{this.attackValue = attackValue;}
	public int getDefenseValue() 								{return defenseValue;}
	public void setDefenseValue(int defenseValue) 				{this.defenseValue = defenseValue;}
	public int getStaminaValue() 								{return staminaValue;}
	public void setStaminaValue(int staminaValue) 				{this.staminaValue = staminaValue;}
	public int getStaminaMaxValue() 							{return staminaMaxValue;}
	public void setStaminaMaxValue(int staminaMaxValue) 		{this.staminaMaxValue = staminaMaxValue;}
	public CharacterState getCurrentState() 					{return currentState;}
	public void setCurrentState(CharacterState currentState) 	{this.currentState = currentState;}
	public CharacterState getCharacterStateStunned() 			{return stunned;}
	public CharacterState getCharacterStateNeutral() 			{return neutral;}
	public CharacterState getCharacterStateDamaged() 			{return damaged;}
	public CharacterAction getCurrentAction() 					{return currentAction;}
	public void setCurrentAction(CharacterAction currentAction) {this.currentAction = currentAction;}
	public boolean isNeutral() 									{return isNeutral;}
	public void setNeutral(boolean isNeutral) 					{this.isNeutral = isNeutral;}
	public boolean isDamaged() 									{return isDamaged;}
	public void setDamaged(boolean isDamaged) 					{this.isDamaged = isDamaged;}
	public boolean isStunned() 									{return isStunned;}
	public void setStunned(boolean isStunned) 					{this.isStunned = isStunned;}
}