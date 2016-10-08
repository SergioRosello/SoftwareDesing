import java.util.Observer;

public class Biblioteca {

	
	AlarmaLibro alarma;
	
	public Biblioteca(AlarmaLibro alarma) {
		// TODO Auto-generated constructor stub
		
		this.alarma = alarma;
	}
	 
	public void comprobarLibro(Libro libro){
		if (libro.condicion == "Viejo"){
			System.out.println("El libro es viejo");
			alarma.notifyObservers();
		}
		else if (libro.condicion == "Nuevo") System.out.println("El libro está nuevo.");
		else System.out.println("El libro no tiene estado.");
	}

	public static void main(String[] args) {
		
		Libro libro = new Libro();
		AlarmaLibro alarma = new AlarmaLibro();
				
		Administracion administracion = new Administracion(alarma);
		//Compras compras = new Compras(alarma);
		//Stock stock = new Stock(alarma);
		
		alarma.inicializarLibro(libro);
	}

}
