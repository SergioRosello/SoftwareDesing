
public class Biblioteca {
	
	AlarmaLibro alarma;
	
	public Biblioteca(AlarmaLibro alarma) {
		// TODO Auto-generated constructor stub
		
		this.alarma = alarma;
	}
	
	//Falta este m�todo: 
	//notifica a alarma libro si el libro est� mal. 
	public void comprobarLibro(){
		
	}

	
	public static void main(String[] args){
		
		AlarmaLibro alarma = new AlarmaLibro();

		Biblioteca biblioteca = new Biblioteca(alarma);
		biblioteca.comprobarLibro();
	}
}
