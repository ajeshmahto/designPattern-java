package mypackage.structural.decorator;

public class WindowDecorator extends Window {
	
	protected Window window;
	
	public WindowDecorator(Window window){
		this.window = window;
	}
	
	
	@Override
	public void draw(){
		window.draw();
	}

}
