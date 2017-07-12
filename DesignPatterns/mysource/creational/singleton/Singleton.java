package creational.singleton;

public  class Singleton {
	
	private static Singleton instance=null;
	
	protected Singleton(){}
	
	public static synchronized Singleton getInstance() {
		if(instance==null){
			return instance = new Singleton();
		}
		
		return instance;
	}
	
	public void print(){
		System.out.println("Hello I am singleton ");
	}

}
