package mvc.demo;

import controller.StudentController;
import view.StudentView;
import model.StudentModel;

public class StudentDemo {
	
	
	public static void main( String[] args ) {
		
		
		// Initiate controller and tell controller which view and model to use:
		StudentModel model = new StudentModel();
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController ( model, view );
		

		// controller.updateView();
		/* at this point, without any input, putput is:
		 * Student:
		 * Name: null
		 * Roll No: null
		 */
		
		
		controller.setStudentName("Olli");
		controller.setStudentRollNo("1247");
		
		controller.updateView();
		
	}
	
}
