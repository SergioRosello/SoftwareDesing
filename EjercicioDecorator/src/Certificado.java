
public class Certificado extends Recompensas {
	
	Niño niño;
	
	public Certificado(Niño niño) {
		// TODO Auto-generated constructor stub
		this.niño = niño;
	}
	
	@Override
	protected String getDescription(){
		return niño.getDescription() + ", un certificado";
	}
}
