package mypackage.structural.flyweight;

public class Client {
	
	public static void main(String[] args) {
		WordProcessor wp = new WordProcessor();
		String letters = "aaaaaaaaa bbbbbbb ccccccc";
		LetterFactory lf = new LetterFactory();
		
		for(int i=0;i<letters.length();i++){
			String value = letters.substring(i, i+1);
			
			wp.addLetter(lf.createLetter(value));
		}
		
		wp.print();
	}

}
