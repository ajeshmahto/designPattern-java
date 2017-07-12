package mypackage.structural.flyweight;

public class Letter {
	
	String letter;
	
	public Letter(String letter){
		System.err.println("Letter created with " + letter);
		this.letter=letter;
	}
	
	public String getLetter(){
		return this.letter;
	}

}
