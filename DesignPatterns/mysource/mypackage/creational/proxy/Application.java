package mypackage.creational.proxy;

import java.util.ArrayList;
import java.util.List;

public class Application {
	List<Image> images = new ArrayList<Image>();
	
	public Application(List<Image> images){
		this.images = images;
	}
	
	public void draw(){
		for(Image image:images){
			image.draw();
		}
		
	}
	

}
