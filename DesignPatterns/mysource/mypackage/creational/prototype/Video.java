package mypackage.creational.prototype;

public class Video implements Graphic {
	
	private String url;

	
	@Override
	public Graphic cloneImage() {
		Image clone = new Image();
		clone.setUrl(this.url);
		return clone;
	}

	@Override
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


}
