
public class Pegatina extends Recompensas {

	Niño niño;
	public Pegatina(Niño niño) {
		// TODO Auto-generated constructor stub
		this.niño = niño;
	}
	@Override
	protected String getDescription() {
		return niño.getDescription() + " Tengo una pegatina";
		
	}
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Niño removeRecompensa() {
		// TODO Auto-generated method stub
		return niño;
	}
}
