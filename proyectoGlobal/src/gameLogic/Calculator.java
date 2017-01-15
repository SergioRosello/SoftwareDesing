package gameLogic;

import enemies.Enemy;
import player.Player;
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

	//Gestiona la accion del player sobre el enemigo
	public void manage(Player player, Enemy enemy) {
		if(player.getCurrentAction().action.equals("Attack")){
			//Aquí eliminamos la stamina de la acción.
			player.setStaminaValue(player.getStaminaValue() - 10);
			//Aquí se realiza el ataque
			doAttack(player, enemy);
			//Aquí aplicamos los states
			applyState(player, enemy);
		}
		else if(player.getCurrentAction().action.equals("Defense")){
			//Aquí eliminamos la stamina de la acción.
			player.setStaminaValue(player.getStaminaValue() - 5);
			System.out.println(player.getName() + " is on guard!");
		}
		else if(player.getCurrentAction().action.equals("Rest")){
			//Aquí curamos al player, restauramos la stamina al valor máximo y seteamos el state a neutral.
			if(player.getHealthValue() + 10 >= player.getHealthMaxValue()){
				player.setHealthValue(player.getHealthMaxValue());
			}else player.setHealthValue(player.getHealthValue() + 10);
			player.setStaminaValue(player.getStaminaMaxValue());
			player.currentState.setNeutral();
			System.out.println(player.getName() + " has rested! state and stamina recovererd");
		}
		
		//Aquí quitamos la vida del enemigo si el estado es "Damaged"
		applyDamagedState(enemy,  player);
	}
	
	//Sobrecarga del método superior
	//Gestiona la accion del enemigo sobre el player
	public void manage(Enemy enemy, Player player) {
		if(enemy.getCurrentAction().action.equals("Attack")){
			//Aquí eliminamos la stamina de la acción.
			enemy.setStaminaValue(enemy.getStaminaValue() - 10);
			//Aquí se realiza el ataque
			doAttack(enemy, player);
			//Aquí aplicamos los states
			applyState(enemy, player);
		}
		else if(enemy.getCurrentAction().action.equals("Defense")){
			//Aquí eliminamos la stamina de la acción.
			enemy.setStaminaValue(enemy.getStaminaValue() - 5);
			System.out.println(enemy.getName() + " is on guard!");
		}
		else if(enemy.getCurrentAction().action.equals("Rest")){
			//Aquí curamos al enemy, restauramos la stamina al valor máximo y seteamos el state a neutral.
			if(enemy.getHealthValue() + 10 >= enemy.getHealthMaxValue()){
				enemy.setHealthValue(enemy.getHealthMaxValue());
			}else enemy.setHealthValue(enemy.getHealthValue() + 10);
			enemy.setStaminaValue(enemy.getStaminaMaxValue());
			enemy.currentState.setNeutral();
			System.out.println(enemy.getName() + " has rested! state and stamina recovererd");
		}
		
		//Aquí quitamos la vida del enemigo si el estado es "Damaged"
		applyDamagedState(enemy,  player);
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
		System.out.println("--------------------------------");
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
