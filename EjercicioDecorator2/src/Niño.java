
public abstract class Ni�o {
	String description;
	
	protected String getDescription(){
		return "Soy un ni�o, me llamo " + description;
	}
	
	public abstract String getTitulo();
	
	public abstract Ni�o removeRecompensa();
}
