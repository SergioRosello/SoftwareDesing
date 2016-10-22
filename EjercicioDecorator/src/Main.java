
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Niño niño1 = new Roberto();
		niño1 = new Pegatina(niño1);
		niño1 = new Certificado(niño1);
		niño1 = new Libro(niño1);
		
		Niño niño2 = new Sergio();
		niño2 = new Certificado(niño2);
		
		System.out.println(niño1.getDescription());
		
		System.out.println(niño2.getDescription());
	}

}
