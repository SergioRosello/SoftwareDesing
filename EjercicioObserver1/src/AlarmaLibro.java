import java.util.ArrayList;

//AlarmaLibro es nuestro subject
public class AlarmaLibro {

	//Lista de observers (subscriptores a nuestro servicio)
	ArrayList<Observer> observers = new ArrayList<>();

	public void subscribirse(Observer nuevoObserver){
		observers.add(nuevoObserver);
	}
	
	public void dessubscribirse(Observer observerAQuitar){
		observers.remove(observerAQuitar);
	}
	
	public void notificarObservers(Libro libroRoto){
		for(Observer observer : observers){
			System.out.println("Compruebo...");
			observer.notificar(libroRoto);
		}
	}
	
}
