
public class Certificado extends Recompensas {
	
	Ni�o ni�o;
	
	public Certificado(Ni�o ni�o) {
		// TODO Auto-generated constructor stub
		this.ni�o = ni�o;
	}
	
	@Override
	protected String getDescription(){
		return ni�o.getDescription() + ", un certificado";
	}
}
