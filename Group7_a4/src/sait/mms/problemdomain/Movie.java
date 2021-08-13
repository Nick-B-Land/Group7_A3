package sait.mms.problemdomain;

public class Movie {
	private int id, duration, year;
	private String title;
	
	public Movie(int id, int duration, int year, String title) {
		super();
		this.id = id;
		this.duration = duration;
		this.year = year;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", duration=" + duration + ", year=" + year + ", title=" + title + "]";
	}
	
	
	
}
