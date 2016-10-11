import java.util.Observable;
import java.util.Observer;

public class Administracion implements Observer {
	
	Observable observable;
	private Libro libro = new Libro();
	

	public Administracion(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Se notifica a Administracion que el estado del libro es viejo");
		if(o instanceof AlarmaLibro){
			AlarmaLibro alarmaLibro = (AlarmaLibro)o;
			this.libro = alarmaLibro.getLibro();
			displayInfo();
		}
	}
	
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Titulo: " + libro.nombre);
		System.out.println("Autor: " + libro.autor);
		System.out.println("Estado: " + libro.condicion);
	}

}
