
public class Pegatina extends Recompensas {

	Ni�o ni�o;
	public Pegatina(Ni�o ni�o) {
		// TODO Auto-generated constructor stub
		this.ni�o = ni�o;
	}
	@Override
	protected String getDescription() {
		return ni�o.getDescription() + " Tengo una pegatina";
		
	}
}
