
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WidgetFactory windowsFactory = new WindowsWidgetFactory();
		WidgetStore store = new WidgetStore(windowsFactory);
		store.createWidget();
		
		store.setWidgetStore(new MacWidgetFactory());
		store.createWidget();
	}
		
}
