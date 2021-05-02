package thirdDayHomework;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Emre");
		student.setLastName("Pelvan");
		

		Instructor instructor = new Instructor(1,"Engin", "Demiroğ","engindemirog@kodlama.io","123456","Java","English");
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.delete(student);
		userManager.update(student);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.upload(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.save(instructor);
		
		
		
	}

}
