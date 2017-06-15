package yourCode;
import java.util.*;
import java.io.*;
public class ConcertoBook {

	ArrayList<Concerto> concertoBook;
	
	//creates an ArrayList of concertos from the concertos.txt file
	public ConcertoBook(Scanner in) {
		concertoBook = new ArrayList<Concerto>();
		while(in.hasNextLine()) {
			concertoBook.add(new Concerto(in.nextLine().trim()));
		}
	}
	
	public int size() {
		return concertoBook.size();
	}
}
