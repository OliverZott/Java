/**
 * MVC - Controller
 * 
 * - Used to communicate between user-model-view
 * - 
 */

package controller;

import model.StudentModel;
import view.StudentView;


public class StudentController {
	
	private StudentModel _model;
	private StudentView _view;
	
	
	// constructor
	public StudentController( StudentModel model, StudentView view ) {
		this._model = model;
		this._view = view;
	}
	
	// Model functions 
	public void setStudentName(String name) {
		_model.setName(name);
	}
	
	public String getStudentName() {
		return _model.getName();
	}
	
	public void setStudentRollNo( String RollNo ) {
		_model.setRollNo(RollNo);
	}
	
	public String getStudentRollNo() {
		return _model.getRollNo();
	}
	
	// View function
	public void updateView() {
		_view.printStudentDetails(_model.getName(), _model.getRollNo() );
	}
	
}
