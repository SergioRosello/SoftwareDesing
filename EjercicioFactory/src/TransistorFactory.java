
public abstract class TransistorFactory {
	

	protected Transistor encargo(int tipo){
		Transistor transistor;
		transistor = Fabricacion(tipo);
		
		transistor.montaje();
		transistor.encapsulacion();
		return transistor;
	}
	
	abstract Transistor Fabricacion(int tipo); 
}
