package mypackage.creational.prototype;

public class GraphicTool {

	private Graphic prototype;
	
	public GraphicTool(Graphic prototype){
		this.prototype = prototype;
	}
	
	public Graphic createGraphic(){
		return this.prototype;
	}

	public void setPrototype(Graphic prototype) {
		this.prototype = prototype;
	}
}
