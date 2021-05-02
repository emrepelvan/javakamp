package thirdDayHomework;

public class Student extends User{
	
	private int successScore;
	private String levelOfEducation;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String password, int successScore,
			String levelOfEducation) {
		
		this.successScore = successScore;
		this.levelOfEducation = levelOfEducation;
	}

	public int getSuccessScore() {
		return successScore;
	}

	public void setSuccessScore(int successScore) {
		this.successScore = successScore;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}
	
	

}
