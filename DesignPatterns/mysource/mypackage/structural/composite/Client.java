package mypackage.structural.composite;

public class Client {

	public static void main(String[] args) {
		Graphic circle = new Circle();
		Graphic line = new Line();
		CompositeGraphic cg = new CompositeGraphic();
		cg.add(circle);
		cg.add(line);
		
		
		
		Graphic circle2 = new Circle();
		Graphic line2 = new Line();
		CompositeGraphic cg2 = new CompositeGraphic();
		cg2.add(circle);
		cg2.add(line);
		cg.getGraphics().add(cg2);
		cg.draw();
	}
}
