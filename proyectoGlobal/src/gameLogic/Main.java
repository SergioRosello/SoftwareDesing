package gameLogic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mientras el player este vivo, ejecuta juego.
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("You have 40 points!\nDistribute them as you wish");
		System.out.println("You can assign points to your health, stamina, strength and defense");
		System.out.println("How many points do you want to assign to your health? (each point counts as 10 HP)");
		System.out.println(scanner.nextInt());
		
		scanner.close();
	}

}
