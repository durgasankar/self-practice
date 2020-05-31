package LinkList;

public class Song {
	private String title;
	private double duration;
	public Song(String name, double length) {
		this.title = name;
		this.duration = length;
	}
	public String getTitle() {
		return title;
	}
	public double getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return this.title+": " + this.duration;
	}
	
	
	
	

}
