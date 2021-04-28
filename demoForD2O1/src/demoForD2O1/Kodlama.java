package demoForD2O1;

public class Kodlama {

	public static void main(String[] args) {
		
		Lecturer lecturer1 = new Lecturer(1, "Engin DEMÝROÐ");
		Lecturer lecturer2 = new Lecturer(2, "Aysun TERZÝOÐLU");
		
		Lecturer[] lecturers = {lecturer1, lecturer2};
		
		
		Category category1 = new Category(1, "Program1");
		Category category2 = new Category(2, "Program2");

		Category[] categories = {category1 ,category2};
		
		
		Course course1=new Course(1,"Basic Course for Introduction Programming",1,1,65);
		Course course2=new Course(2,"Java",2,1,32);
		
		Course[] courses = {course1, course2};
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		
		System.out.println(".............................");
		System.out.println("Courses : ");
		for (Course course : courses) {
			System.out.println(course.id +"." + course.name);
		}
		
		System.out.println(".............................");
		System.out.println("Categories : ");
		for (Category category : categories) {
			System.out.println(category.id + "." + category.name);
		}
		
		System.out.println(".............................");
		System.out.println("Lecturers : ");
		for (Lecturer lecturer : lecturers) {
			System.out.println(lecturer.id + "." + lecturer.name);
		}
		
		System.out.println(".............................");
		UserManager userManager=new UserManager();
		userManager.RegisterToCourse(course2);
	}
}
