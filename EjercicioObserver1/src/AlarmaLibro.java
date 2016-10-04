import java.util.ArrayList;

public class AlarmaLibro {

	//Lista de observers (subscriptores a nuestro servicio)
	ArrayList<Observer> observers = new ArrayList<>();
	

	public void subscribirse(Observer nuevoObserver){
		observers.add(nuevoObserver);
	}
	
	public void dessubscribirse(Observer observerAQuitar){
		observers.remove(observerAQuitar);
	}
}
