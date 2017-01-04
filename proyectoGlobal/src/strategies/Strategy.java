package strategies;

public interface Strategy {

	//Este método se va a implementar de forma idéntica en cada uno de sus
	//dos hijos (Aggressive y Defensive) a pesar de ser un patrón strategy.
	//Hacemos esto porque hemos planteado el comportamiento de los enemigos
	//De una forma aleatoria con rangos, en los que una estrategia agresiva
	//tiene más probabilidades de atacar que una estratagia defensiva y viceversa.
	public void chooseAction();
}
