package yourCode;

public class MajorScale {
	private String name;
	private String notes;
	private String relative;
	
	public MajorScale(String data) {
		String[] parts = data.split("/");
		name = parts[0];
		notes = parts[1];
		relative = parts[2];
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return notes;
	}
	
	public String getRelative() {
		return relative;
	}
	
}
