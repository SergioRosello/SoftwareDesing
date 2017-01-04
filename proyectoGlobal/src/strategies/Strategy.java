package strategies;

public interface Strategy {

	//Este m�todo se va a implementar de forma id�ntica en cada uno de sus
	//dos hijos (Aggressive y Defensive) a pesar de ser un patr�n strategy.
	//Hacemos esto porque hemos planteado el comportamiento de los enemigos
	//De una forma aleatoria con rangos, en los que una estrategia agresiva
	//tiene m�s probabilidades de atacar que una estratagia defensiva y viceversa.
	public void chooseAction();
}
