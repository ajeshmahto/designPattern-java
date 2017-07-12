package mypackage.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
	
	private List<Letter> letters = new ArrayList<Letter>();
	
	public void addLetter(Letter letter){
		letters.add(letter);
	}
	
	public void print(){
		for(Letter letter:letters){
			System.err.println(letter.getLetter());
		}
	}

}
