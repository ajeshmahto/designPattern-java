package mypackage.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
	
	Map<String, Letter> mapLetter = new HashMap<String,Letter>();
	
	
	public Letter createLetter(String key){
		Letter letter = mapLetter.get(key);
		
		if(letter ==null){
			letter = new Letter(key);
			mapLetter.put(key, letter);
		}
		
		return letter;
	}
	
	

}
