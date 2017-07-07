package casestudy.rendering;


import casestudy.documentstructure.improved.ComposedWorldObject;

public class Client {

	public static void main(String[] args){
	
		ComposedWorldObject root = new ComposedWorldObject("root");

		
		
		RenderingSystem renderingSystem = new RenderingSystem();
		
		WorldObjectRenderer renderer = new QuickRenderer();
		WorldObjectRenderer finalImageRenderer = new DetailedRenderer();

		renderingSystem.setWorldObjectRenderer(renderer);
		renderingSystem.render(root);
		
		renderingSystem.setWorldObjectRenderer(finalImageRenderer);
		renderingSystem.render(root);
		
	}
	
}
