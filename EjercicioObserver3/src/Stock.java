import java.util.Observable;
import java.util.Observer;

public class Stock implements Observer {
	
	Observable observable;
	private Libro libro = new Libro();
	

	public Stock(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Se notifica a Stock que el estado del libro es viejo");
		if(o instanceof AlarmaLibro){
			AlarmaLibro alarmaLibro = (AlarmaLibro)o;
			this.libro.nombre = alarmaLibro.getLibro().nombre;
			this.libro.autor = alarmaLibro.getLibro().autor;
			this.libro.condicion = alarmaLibro.getLibro().condicion;
			displayInfo((Libro) arg);
		}
	}
	
	public void displayInfo(Libro libroAMostrar) {
		// TODO Auto-generated method stub
		System.out.println("Titulo: " + libroAMostrar.nombre);
		System.out.println("Autor: " + libroAMostrar.autor);
		System.out.println("Estado: " + libroAMostrar.condicion);
	}

}
