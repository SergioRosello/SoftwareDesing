
public class Libro extends Recompensas {

	Ni�o ni�o;
	String titulo;
	
	public Libro(Ni�o ni�o) {
		this.ni�o = ni�o;
		
	}
	
	public Libro(Ni�o ni�o, String titulo){
		this.ni�o = ni�o;
		this.titulo = titulo;
	}
	
	protected String getDescription() {
		return ni�o.getDescription() + ", un libro";
	}
	
	public String getTitulo(){
		return this.titulo;
	}

	@Override
	public Ni�o removeRecompensa() {
		// TODO Auto-generated method stub
		return ni�o;
	}
	
}
