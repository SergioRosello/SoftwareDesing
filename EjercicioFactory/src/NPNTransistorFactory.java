
public class NPNTransistorFactory extends TransistorFactory {

	@Override
	Transistor Fabricacion(int tipo) {
		// TODO Auto-generated method stub
		if(tipo == 5) return new NPN5V();
		else if(tipo == 12) return new NPN12V();
		return null;
	}

}
