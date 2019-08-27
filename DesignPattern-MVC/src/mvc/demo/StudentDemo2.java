package mvc.demo;

import controller.StudentController;
import model.StudentModel;
import view.StudentView;

public class StudentDemo2 {
	
	// creating model for student from StudentModel and initiate studentmodel object!
	private static StudentModel retriveStudentFromDatabase() {
		StudentModel student = new StudentModel();
		student.setName("Lena");
		student.setRollNo("1257");
		return student;
	}
	
	
	// Main where Student is fetched
	public static void main( String[] args ) {
		
		StudentModel model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		// fetch the initiated student from StudentModel object
		controller.updateView();
		
		// update Model
		controller.setStudentName("Zwuuuguu");
		
		controller.updateView();
	}
	

}
