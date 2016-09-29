
public class MallardDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
	
	 public MallardDuck(){
			flyBehavior = new FlyWithWings();
			quackBehavior = new Quack();
	}

}
