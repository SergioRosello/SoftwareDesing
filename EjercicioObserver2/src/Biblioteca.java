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
			alarma.notificarObservadores(libro);
		}
		else if (libro.condicion == "Nuevo") System.out.println("El libro está nuevo.");
		else System.out.println("El libro no tiene estado.");
	}

	public static void main(String[] args) {
		
		AlarmaLibro alarma = new AlarmaLibro();
		Libro libro = new Libro();
		Biblioteca biblioteca = new Biblioteca(alarma);

		Observer miObserver = new Stock();
		Observer miSegundoObserver = new Administracion();
		Observer miTercerObserver = new Compras();

		alarma.addObserver(miObserver);
		alarma.addObserver(miSegundoObserver);
		alarma.addObserver(miTercerObserver);

		libro.condicion = "Viejo";
		libro.autor = "Roberto Rrías";
		libro.nombre = "Introducción al Rage";

		biblioteca.comprobarLibro(libro);
	}

}
