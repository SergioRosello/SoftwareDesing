
public class Biblioteca {
	
	AlarmaLibro alarma;
	
	public Biblioteca(AlarmaLibro alarma) {
		// TODO Auto-generated constructor stub
		
		this.alarma = alarma;
	}
	
	//Falta este método: 
	//notifica a alarma libro si el libro está mal. 
	public void comprobarLibro(Libro libro){
		if (libro.condicion == "Viejo"){
			System.out.println("El libro es viejo");
			alarma.notificarObservers(libro);
		}
		else if (libro.condicion == "Nuevo") System.out.println("El libro está nuevo.");
		else System.out.println("El libro no tiene estado.");
	}

	
	public static void main(String[] args){
		
		AlarmaLibro alarma = new AlarmaLibro();
		Libro libro = new Libro();
		Biblioteca biblioteca = new Biblioteca(alarma);
		
		Observer miObserver = new Stock();
		Observer miSegundoObserver = new Administracion();
		Observer miTercerObserver = new Compras();

		alarma.subscribirse(miObserver);
		alarma.subscribirse(miSegundoObserver);
		alarma.subscribirse(miTercerObserver);

		libro.condicion = "Viejo";
		biblioteca.comprobarLibro(libro);
	}
}
