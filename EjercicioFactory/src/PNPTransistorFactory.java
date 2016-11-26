
public class PNPTransistorFactory extends TransistorFactory {

	@Override
	Transistor Fabricacion(int tipo) {
		// TODO Auto-generated method stub
		if(tipo == 5) return new PNP5V();
		else if(tipo == 12) return new PNP12V();
		return null;
	}

}
