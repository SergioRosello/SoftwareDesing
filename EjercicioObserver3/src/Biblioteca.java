public class Biblioteca {

	AlarmaLibro alarma;
	
	public Biblioteca(AlarmaLibro alarma) {
		// TODO Auto-generated constructor stub
		this.alarma = alarma;
	}
	 
	public static void main(String[] args) {
		
		Libro libro = new Libro();
		AlarmaLibro alarma = new AlarmaLibro();

		Administracion administracion = new Administracion(alarma);
		Compras compras = new Compras(alarma);
		Stock stock = new Stock(alarma);
		
		alarma.inicializarLibro(libro);

		libro.autor = "Pablito Escobar Gaviria";
		libro.nombre = "Como ser presidente de la republica de Colombia!";
		libro.condicion = "Viejo";
		
		alarma.inicializarLibro(libro);
	}

}
