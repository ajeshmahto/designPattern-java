package mypackage.creational.prototype;

public class Client {
	
	
	
	public static void main(String[] args) {
		Image image = new Image();
		image.setUrl("hello");
		
		GraphicTool gt = new GraphicTool(image);
		
		Graphic graphic = gt.createGraphic();
		
		System.out.println(" Prototype pattern "+ graphic.getClass() + " url " +graphic.getUrl());
	    image.setUrl("another image");
	    graphic = gt.createGraphic();
		System.out.println(" Prototype pattern "+ graphic.getClass() + " url " +graphic.getUrl());
		
		Video video = new Video();
		video.setUrl("video");
		
		gt.setPrototype(video);
		graphic = gt.createGraphic();
		
		System.out.println(" Prototype pattern "+ graphic.getClass() + " url " +graphic.getUrl());
	}

}
