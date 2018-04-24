package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person{
	private int studentNumber;
	public Faculty()    {
		super();        
		studentNumber = 0;//Indicating no number yet    
	}
	
	public Faculty(String initialName, int initialStudentNumber){
		super(initialName);        
		studentNumber = initialStudentNumber;    
	}
	
	public void reset(String newName, int newStudentNumber) {
		setName(newName);        
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
	
	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber); 
	}
	
	public boolean equals(Faculty otherStudent) {
		return this.hasSameName(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	} 

}
