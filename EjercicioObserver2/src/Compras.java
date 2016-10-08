import java.util.Observable;
import java.util.Observer;

public class Compras implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Se notifica a Compras que el estado del libro es viejo");
		displayInfo((Libro) arg);
	}
	
	public void displayInfo(Libro libroAMostrar) {
		// TODO Auto-generated method stub
		System.out.println("Titulo: " + libroAMostrar.nombre);
		System.out.println("Autor: " + libroAMostrar.autor);
		System.out.println("Estado: " + libroAMostrar.condicion);
	}

}
