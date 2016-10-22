
public abstract class Niño {
	String description;
	
	protected String getDescription(){
		return "Soy un niño, me llamo " + description;
	}
	
	public abstract Niño removeRecompensa();
}
