package yourCode;

public class Etude {

	private String rank;
	private String composer;
	private String title;
	
	public Etude(String info) {
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
}
