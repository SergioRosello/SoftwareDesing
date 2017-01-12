package character;
import actions.CharacterAction;
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
		stunned = false;
		damaged = false;
		neutral = true;
		currentState = Neutral;
		currentAction = null;
		attackRange = 5;
		defenseRange = 5;
	}

	//Common variables
	String name;
	int healthValue; 
	int healthMaxValue;	//To prevent the character from having more life that it starts with.
	int attackValue;
	int defenseValue;
	int staminaValue;
	int staminaMaxValue;	//To prevent the character from having more stamina that it starts with.
	
	//Para poder elejir el comportamiento del enemigo
	//según una estrategia, tenemos que tener un rango
	//El rango completo va a ser de 10
	int attackRange;
	int defenseRange;
	
	boolean stunned;
	boolean damaged;
	boolean neutral;
	public CharacterState currentState;
	public CharacterAction currentAction;
	
	//Possible character states.
	CharacterState Neutral;
	CharacterState Damaged;
	CharacterState Stunned; 
	
	//Methods
	protected void applyDecorator() {
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
	

	//Getters and Setters
	public String getName() 									{return name;}
	public void setName(String name) 							{this.name = name;}
	public int getHealthValue() 								{return healthValue;}
	public void setHealthValue(int healthValue) 				{this.healthValue = healthValue;}
	public int getAttackValue() 								{return attackValue;}
	public void setAttackValue(int attackValue) 				{this.attackValue = attackValue;}
	public int getDefenseValue() 								{return defenseValue;}
	public void setDefenseValue(int defenseValue) 				{this.defenseValue = defenseValue;}
	public int getStaminaValue() 								{return staminaValue;}
	public void setStaminaValue(int staminaValue) 				{this.staminaValue = staminaValue;}
	public int getStaminaMaxValue() 							{return staminaMaxValue;}
	public void setStaminaMaxValue(int staminaMaxValue) 		{this.staminaMaxValue = staminaMaxValue;}
	public boolean isStunned() 									{return stunned;}
	public boolean isDamaged()									{return damaged;}
	public boolean isNeutral()									{return neutral;}
	public void setStunned(boolean stunned) 					{this.stunned = stunned;}
	public void setDamaged(boolean damaged) 					{this.damaged = damaged;}
	public void setNeutral(boolean neutral) 					{this.neutral = neutral;}
	public CharacterState getCurrentState() 					{return currentState;}
	public void setCurrentState(CharacterState currentState) 	{this.currentState = currentState;}
	public void setNeutral(CharacterState neutral) 				{Neutral = neutral;}
	public void setDamaged(CharacterState damaged) 				{Damaged = damaged;}
	public void setStunned(CharacterState stunned) 				{Stunned = stunned;}
	//Sets the state of the character
	void setState(CharacterState state) 						{this.currentState = state;}
	public CharacterState getStunned() 							{return Stunned;}
	public CharacterState getNeutral() 							{return Neutral;}
	public CharacterState getDamaged() 							{return Damaged;}
	public int getHealthMaxValue() 								{return healthMaxValue;}
	public void setHealthMaxValue(int healthMaxValue) 			{this.healthMaxValue = healthMaxValue;}
	public CharacterAction getCurrentAction() 					{return currentAction;}
	public void setCurrentAction(CharacterAction currentAction) {this.currentAction = currentAction;}
	public int getAttackRange() 								{return attackRange;}
	public void setAttackRange(int attackRange) 				{this.attackRange = attackRange;}
	public int getDefenseRange() 								{return defenseRange;}
	public void setDefenseRange(int defenseRange) 				{this.defenseRange = defenseRange;}
	
	
}