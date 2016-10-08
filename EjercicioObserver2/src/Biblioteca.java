import java.util.Observer;

public class Biblioteca {

	
	AlarmaLibro alarma;
	
	public Biblioteca(AlarmaLibro alarma) {
		// TODO Auto-generated constructor stub
		
		this.alarma = alarma;
	}
	

	//Falta este m�todo: 
	//notifica a alarma libro si el libro est� mal. 
	public void comprobarLibro(Libro libro){
		if (libro.condicion == "Viejo"){
			System.out.println("El libro es viejo");
			alarma.notifyObservers(libro);
		}
		else if (libro.condicion == "Nuevo") System.out.println("El libro est� nuevo.");
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
		libro.autor = "Roberto Rr�as";
		libro.nombre = "Introducci�n al Rage";
		
		otroLibro.condicion  ="Nuevo";
		otroLibro.autor = "Sergio Rosell�";
		otroLibro.nombre = "Introducci�n a los gadjets";
		
		biblioteca.comprobarLibro(libro);
		biblioteca.comprobarLibro(otroLibro);
	}

}
