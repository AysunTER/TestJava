package polimorfizmd302;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("DEMÝROG");
		instructor.setBranch("Java");
		
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Aysun");
		student.setLastName("TERZÝOÐLU");
		student.seteMail("xxxxxx@gmail.com");
		student.setPassword("xx");
		student.setEducationLevel("Hesaplanacak");
		
		InstructorManager  instructorManager  = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		
		StudentManager studentManager =new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		
		
		
		
	}

}
