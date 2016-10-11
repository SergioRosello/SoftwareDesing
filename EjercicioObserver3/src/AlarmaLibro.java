import java.util.Observable;

public class AlarmaLibro extends Observable{
	private Libro libro = new Libro();
	public AlarmaLibro(){	}
	
	public void inicializarLibro(Libro libro){
		this.libro.autor = libro.autor;
		this.libro.nombre = libro.nombre;
		this.libro.condicion = libro.condicion;
		notificarObservadores();
	}
	
	public void notificarObservadores() {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers();
	}
	
	public Libro getLibro(){
		return this.libro;
	}
	
}
