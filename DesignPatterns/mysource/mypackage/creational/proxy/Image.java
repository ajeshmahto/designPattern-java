package mypackage.creational.proxy;

public class Image {
	protected String url;
	
	public Image(){
		
	}
	
	public Image(String url){
		this.url=url;
	}
	
	public void draw(){
		System.err.println(" drawing image url " + this.url);
	}

}
