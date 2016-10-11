import java.util.Observable;

public class AlarmaLibro extends Observable{
	
	public AlarmaLibro(){
		
	}
	
	public void notificarObservadores(Object arg) {
		// TODO Auto-generated method stub
		setChanged();
		notifyObservers(arg);
	}
	

}
