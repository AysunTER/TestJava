package demoForD2O1;

public class Course {
	
	public Course (	int id, String name, int categoryId, int lecturerId, double completionRate) {
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.lecturerId = lecturerId;
		this.completionRate = completionRate;
		
	}
	
	
	int id;
	String name;
	int categoryId; 
	int lecturerId; //eðitmen
	double completionRate; //tamamlama

	

}
