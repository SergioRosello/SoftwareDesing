
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ni�o ni�o1 = new Roberto();
		ni�o1 = new Pegatina(ni�o1);
		ni�o1 = new Certificado(ni�o1);
		ni�o1 = ni�o1.removeRecompensa();
		ni�o1 = new Libro(ni�o1, "Ejemplo");
		ni�o1 = ni�o1.removeRecompensa();
		
		
		Ni�o ni�o2 = new Sergio();
		ni�o2 = new Certificado(ni�o2);
		
		System.out.println(ni�o1.getDescription());
		
		System.out.println(ni�o2.getDescription());
		
		System.out.println(ni�o1.getTitulo());
	}

}
