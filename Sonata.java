package yourCode;

public class Sonata {

	private String rank;
	private String composer;
	private String title;
	
	public Sonata(String info) {
		String[] specs = info.split("/");
		rank = specs[0];
		composer = specs[1];
		title = specs[2];
	}	
	
	//returns rank
	public String getRank() {
		return rank;
	}
		
	//returns composer
	public String getComposer() {
		return composer;
	}
		
	//returns title
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return rank + "\t" + composer + "\t" + title;
	}
}
