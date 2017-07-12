package mypackage.creational.proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		ImageProxy ip1 = new ImageProxy("url 1");
		ImageProxy ip2 = new ImageProxy("url 2");
		List<Image> images = new ArrayList<Image>();
		images.add(ip1);
		images.add(ip2);
		
		Application app = new Application(images);
		System.err.println("application setup");
		app.draw();
	}

}
