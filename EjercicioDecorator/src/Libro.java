
public class Libro extends Recompensas {

	Ni�o ni�o;
	
	public Libro(Ni�o ni�o) {
		// TODO Auto-generated constructor stub
		this.ni�o = ni�o;
	}
	
	protected String getDescription() {
		return ni�o.getDescription() + ", un libro";
	}

}
