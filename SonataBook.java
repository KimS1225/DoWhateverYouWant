package yourCode;
import java.util.*;
import java.io.*;

public class SonataBook {
	
	ArrayList<Sonata> sonataBook;

	//creates an ArrayList of sonatas from the sonatas.txt file
	public SonataBook(Scanner in) {
		sonataBook = new ArrayList<Sonata>();
		while(in.hasNextLine()) {
			sonataBook.add(new Sonata(in.nextLine().trim()));
		}
	}
	
	public int size() {
		return sonataBook.size();
	}
}
