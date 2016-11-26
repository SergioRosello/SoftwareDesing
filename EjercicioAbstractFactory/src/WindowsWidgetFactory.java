
public class WindowsWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new WindowsScrollBar();
		// TODO Auto-generated method stub
		
	}

	@Override
	public List createList() {
		return new WindowsList();
		// TODO Auto-generated method stub
		
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
		// TODO Auto-generated method stub
		
	}

}
