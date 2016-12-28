
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
}
