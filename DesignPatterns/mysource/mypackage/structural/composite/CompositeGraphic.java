package mypackage.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
	
	private List<Graphic> graphics = new ArrayList<Graphic>();
	
	public List<Graphic> getGraphics(){
		return this.graphics;
	}
	
	
	public void add(Graphic graphic){
		graphics.add(graphic);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		for(Graphic graphic:graphics){
			graphic.draw();
		}
		
	}

}
