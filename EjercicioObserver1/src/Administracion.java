
public class Administracion implements Observer {

	@Override
	public void notificar(Libro libroANotificar) {
		// TODO Auto-generated method stub
		System.out.println("Se notifica a administracion que el libro es viejo.");
		displayInfo(libroANotificar);
	}

	@Override
	public void displayInfo(Libro libroAMostrar) {
		// TODO Auto-generated method stub
		System.out.println("Titulo: " + libroAMostrar.nombre);
		System.out.println("Autor: " + libroAMostrar.autor);
		System.out.println("Estado: " + libroAMostrar.condicion);
	}

}
