
public class Biblioteca {
	
	AlarmaLibro alarma;
	
	public Biblioteca(AlarmaLibro alarma) {
		// TODO Auto-generated constructor stub
		
		this.alarma = alarma;
	}
	
	public void comprobarLibro(){
		
	}

	
	public static void main(String[] args){
		
		AlarmaLibro alarma = new AlarmaLibro();

		Biblioteca biblioteca = new Biblioteca(alarma);
		biblioteca.comprobarLibro();
	}
}
