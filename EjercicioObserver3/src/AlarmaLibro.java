import java.util.Observable;

public class AlarmaLibro extends Observable{
	private Libro libro = new Libro();
	public AlarmaLibro(){	}
	
	public void inicializarLibro(Libro libro){
		this.libro.autor = libro.autor;
		this.libro.nombre = libro.nombre;
		this.libro.condicion = libro.condicion;
		notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		super.setChanged();
		super.notifyObservers(libro);
	}
	
	public Libro getLibro(){
		return this.libro;
	}
	
}
