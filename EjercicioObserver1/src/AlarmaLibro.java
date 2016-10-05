import java.util.ArrayList;

//AlarmaLibro es nuestro subject
public class AlarmaLibro {

	//Lista de observers (subscriptores a nuestro servicio)
	ArrayList<Observer> observers = new ArrayList<>();
	Libro libroANotificar = new Libro();

	public void subscribirse(Observer nuevoObserver){
		observers.add(nuevoObserver);
	}
	
	public void dessubscribirse(Observer observerAQuitar){
		observers.remove(observerAQuitar);
	}
	
	public void notificarObservers(){
		for(Observer observer : observers){
			observer.notificar(libroANotificar);
		}
	}
	
}
