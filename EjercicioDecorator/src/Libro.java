
public class Libro extends Recompensas {

	Niño niño;
	
	public Libro(Niño niño) {
		// TODO Auto-generated constructor stub
		this.niño = niño;
	}
	
	protected String getDescription() {
		return niño.getDescription() + ", un libro";
	}

}
