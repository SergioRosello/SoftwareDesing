
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransistorFactory NPNfactory = new NPNTransistorFactory();
		TransistorFactory PNPfactory = new PNPTransistorFactory();

		Transistor transistor = NPNfactory.encargo(5);
		transistor = NPNfactory.encargo(12);
		
		transistor = PNPfactory.encargo(5);
		transistor = PNPfactory.encargo(12);
	}

}
