package polimorfizmd302;

public class StudentManager extends UserManager {
	
	public void levelCourse (Student student) {
		System.out.println(student.getFirstName() + student.getEducationLevel());
	}
}
