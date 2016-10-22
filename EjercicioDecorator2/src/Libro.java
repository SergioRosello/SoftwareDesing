
public class Libro extends Recompensas {

	Niño niño;
	String titulo;
	
	public Libro(Niño niño) {
		this.niño = niño;
		
	}
	
	public Libro(Niño niño, String titulo){
		this.niño = niño;
		this.titulo = titulo;
	}
	
	protected String getDescription() {
		return niño.getDescription() + ", un libro";
	}
	
	public String getTitulo(){
		return this.titulo;
	}

}
