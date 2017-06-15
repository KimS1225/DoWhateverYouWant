package yourCode;
import java.util.*;

public class MinorScaleBook {
	
	ArrayList<MinorScale> minorScaleBook;
	
	public MinorScaleBook(Scanner in) {
		minorScaleBook = new ArrayList<MinorScale>();
		while(in.hasNextLine()) {
			minorScaleBook.add(new MinorScale(in.nextLine().trim()));
		}
	}
	
	public int size() {
		return minorScaleBook.size();
	}
	
	public MinorScale get(int e) {
		return minorScaleBook.get(e);
	}
	
	public int indexOf(String args) {
		return minorScaleBook.indexOf(args);
	}
}
