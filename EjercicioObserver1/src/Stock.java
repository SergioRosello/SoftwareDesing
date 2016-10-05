
public class Stock implements Observer {

	@Override
	public void notificar(Libro libroANotificar) {
		// TODO Auto-generated method stub
		System.out.println("Stock");
	}

	@Override
	public void displayInfo(Libro libroAMostrar) {
		// TODO Auto-generated method stub
		System.out.println("Titulo: " + libroAMostrar.nombre);
		System.out.println("Autor: " + libroAMostrar.autor);
	}

	
}
