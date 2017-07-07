package creational.abstractfactory.improved;

public class PinkThemeWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new PinkThemeScrollBar();
	}

	@Override
	public Window createWindow() {
		return new PinkThemeWindow();
	}

}
