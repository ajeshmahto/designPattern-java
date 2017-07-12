package mypackage.structural.decorator;


public class WindowScrollBarDecorator extends WindowDecorator {
	

	
	public WindowScrollBarDecorator(Window window){
		super(window);
	}
	
	
	@Override
	public void draw(){
		
		System.out.println(" window with scroll");
		window.draw();
	}

}
