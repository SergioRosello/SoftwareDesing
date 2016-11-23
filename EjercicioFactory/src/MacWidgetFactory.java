
public class MacWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new MacScrollBar();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List createList() {
		return new MacList();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Button createButton() {
		return new MacButton();
		// TODO Auto-generated method stub
		
	}

}
