package thirdDayHomework;

public class Instructor extends User{
	
	private String educationName;
	private String language;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String educationName,
			String language) {
		
		this.educationName = educationName;
		this.language = language;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	
}
