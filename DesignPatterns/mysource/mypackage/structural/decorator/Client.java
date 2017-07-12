package mypackage.structural.decorator;

public class Client {

	
	public static void main(String[] args) {
		Window window = new Window();
		IconWindowDecorator iconWindow = new IconWindowDecorator(window);
		WindowScrollBarDecorator scrollWindow = new WindowScrollBarDecorator(iconWindow);
		scrollWindow.draw();
		
		
	}
}
