import java.util.Observable;
import java.util.Observer;

public class AlarmaLibro extends Observable{
	
	public AlarmaLibro(){
		
	}
	
	@Override
	public void notifyObservers(Object arg) {
		// TODO Auto-generated method stub
		super.notifyObservers(arg);
	}
	
	@Override
	public synchronized void addObserver(Observer o) {
		// TODO Auto-generated method stub
		super.addObserver(o);
	}
	
	@Override
	public synchronized void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		super.deleteObserver(o);
	}
}
