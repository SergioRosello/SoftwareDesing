package gameLogic;

import character.Character;

//Calculates attack results.
public class Calculator {

	private static Calculator uniqueInstance;
	
	public static Calculator getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new Calculator();
			return uniqueInstance;
			}
		return uniqueInstance;
	}

	//Gestiona la accion del active sobre el enemigo
	public void manage(Character active, Character passive) {
		if(active.getCurrentAction().action.equals("Attack")){
			//Aquí eliminamos la stamina de la acción.
			active.setStaminaValue(active.getStaminaValue() - 10);
			//Aquí se realiza el ataque
			doAttack(active, passive);
			//Aquí aplicamos los states
			applyState(active, passive);
		}
		else if(active.getCurrentAction().action.equals("Defense")){
			//Aquí eliminamos la stamina de la acción.
			active.setStaminaValue(active.getStaminaValue() - 5);
			System.out.println(active.getName() + " is on guard!");
		}
		else if(active.getCurrentAction().action.equals("Rest")){
			//Aquí curamos, restauramos la stamina al valor máximo y seteamos el state a neutral.
			if(active.getHealthValue() + 10 >= active.getHealthMaxValue()){
				active.setHealthValue(active.getHealthMaxValue());
			}else active.setHealthValue(active.getHealthValue() + 10);
			active.setStaminaValue(active.getStaminaMaxValue());
			active.currentState.setNeutral();
			System.out.println(active.getName() + " has rested! state and stamina recovererd");
		}
		//Aquí quitamos la vida a los personajes si el estado es "Damaged"
		applyDamagedState(passive,  active);
	}
	
	private void applyState(Character character, Character character2){
		if(character.getCurrentAction().decorator.equals("Strong")){
			int probability = (int) (Math.random() *(10 + 1));
			if(probability >= 0 && probability <= 1){
				character2.getCurrentState().setStunned();
				System.out.println(character.getName() + " has stunned " + character2.getName() + " !");
			}
		}
		else if(character.getCurrentAction().decorator.equals("Normal")){
			int probability = (int) (Math.random() *(10 + 1));
			if(probability >= 0 && probability <= 1){
				character2.getCurrentState().setDamaged();
				System.out.println(character.getName() + " has damaged " + character2.getName() + " !");
			}
		}else{
			int probability = (int) (Math.random() *(100 + 1));
			if(probability >= 0 && probability <= 5){
				character2.getCurrentState().setDamaged();
				System.out.println(character.getName() + " has damaged " + character2.getName() + " !");
			}
		}
		
	}

	private void applyDamagedState(Character character, Character character2){
		if(character.getCurrentState() == character.getCharacterStateDamaged()){
			character.setHealthValue(character.getHealthValue() - 5);
		}
		if(character2.getCurrentState() == character2.getCharacterStateDamaged()){
			character2.setHealthValue(character2.getHealthValue() - 5);
		}
		System.out.println("--------------------------------");
		System.out.println(character.getName() + " has " + character.getHealthValue() + " of "  + character.getHealthMaxValue() + " HP left and " +
							character.getStaminaValue() + " of "  + character.getStaminaMaxValue() + " SP left.");
		System.out.println(character2.getName() + " has " + character2.getHealthValue() + " of "  + character2.getHealthMaxValue() + " HP left and " +
				character2.getStaminaValue() + " of "  + character2.getStaminaMaxValue() + " SP left.");
		System.out.println("--------------------------------\n");
	}

	private void doAttack(Character character, Character character2){
		int damage;
		//Aquí calculamos el daño
		if(character2.getCurrentAction().action.equals("Defense")){
			damage = (character.getAttackValue() + character.getCurrentAction().quantity()) - (character2.getDefenseValue() + character2.getCurrentAction().quantity());
		}
		else{
			damage = (character.getAttackValue() + character.getCurrentAction().quantity()) - character2.getDefenseValue();
		}
		
		//Aquí aplicamos el daño
		if(damage <= 5){
			damage = 5;
			character2.setHealthValue(character2.getHealthValue() - damage);
		}
		else{
			character2.setHealthValue(character2.getHealthValue() - damage);
		}
		System.out.println(character.getName() + " has dealt " + character2.getName() + " a " + damage + " damage " + character.getCurrentAction().decorator + " attack");
	}
}
