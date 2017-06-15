package yourCode;

import java.util.ArrayList;
import java.util.Scanner;

public class EtudeBook {
	
	ArrayList<Etude> etudeBook;
	
	//creates an ArrayList of etudes from the etudes.txt file
	public EtudeBook(Scanner in) {
		etudeBook = new ArrayList<Etude>();
		while(in.hasNextLine()) {
			etudeBook.add(new Etude(in.nextLine().trim()));
		}
	}

	public int size() {
		return etudeBook.size();
	}
}
