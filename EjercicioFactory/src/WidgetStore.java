
public class WidgetStore {

	private WidgetFactory factory;
	
	public WidgetStore(WidgetFactory factory){
		this.factory = factory;
	}
	
	public void createWidget(){
		factory.createButton();
		factory.createList();
		factory.createScrollBar();
	}
	
	public void setWidgetStore(WidgetFactory factory){
		this.factory = factory;
	}

}
