import java.util.Observer;

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
			alarma.notifyObservers(libro);
		}
		else if (libro.condicion == "Nuevo") System.out.println("El libro está nuevo.");
		else System.out.println("El libro no tiene estado.");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AlarmaLibro alarma = new AlarmaLibro();
		Libro libro = new Libro();
		Libro otroLibro = new Libro();
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
		
		otroLibro.condicion  ="Nuevo";
		otroLibro.autor = "Sergio Roselló";
		otroLibro.nombre = "Introducción a los gadjets";
		
		biblioteca.comprobarLibro(libro);
		biblioteca.comprobarLibro(otroLibro);
	}

}
