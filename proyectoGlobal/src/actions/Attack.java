package actions;

import character.Character;
import decorator.Normal;
import decorator.Strong;
import decorator.Weak;

public class Attack extends CharacterAction {


	Character character;
	
	 public Attack() {
		 proceedWithAction();
	}
	
	
	@Override
	protected void prepareAction() {
		int staminaValue = character.getStaminaValue();
		int staminaMaxValue = character.getStaminaMaxValue();
		
		//Fuerte
		if(staminaValue <= staminaMaxValue && staminaValue >= (staminaMaxValue/3 * 2)){
			character = new Strong(character);
		}
		//Normal
		else if(staminaValue <= (staminaMaxValue/3 * 2) && staminaValue >= (staminaMaxValue/3)){
			character = new Normal(character);
		}
		//Debil
		else{
			character = new Weak(character);
		}
	}
	
	@Override
	protected void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void endAction() {
		// TODO Auto-generated method stub
		removeStat();
	}
	
	
	//Estos dos métodos no vamos a usarlos en esta clase.
	@Override
	protected Character quantity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Character removeStat() {
		// TODO Auto-generated method stub
		return null;
	}
}
