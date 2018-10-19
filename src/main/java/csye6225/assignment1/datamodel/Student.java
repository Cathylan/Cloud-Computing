package csye6225.assignment1.datamodel;

import java.util.*;


public class Student {
	private String StudentName;
	private int StudentId;
	private String StudentImage; 
	private HashSet<String> Courses;
	private String ProgramName;
	
	public Student() {
		
	}
	public Student(String studentName, int studentId, String StudentImage, HashSet<String> Courses, String ProgramName) {
		this.StudentName = studentName;
		this.StudentId = studentId;
		this.StudentImage = StudentImage;
		this.Courses = Courses;
		this.ProgramName = ProgramName; 
	}
	
	public String getProgramName() {
		return ProgramName;
	}
	
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	
	public HashSet<String> getCourses() {
		return Courses;
	}
	
	public void setCourses(HashSet<String> courses) {
		Courses = courses;
	}
	
	public String getStudentImage() {
		return StudentImage;
	}
	
	public void setStudentImage(String url) {
		StudentImage = url;
	}
	
	public String getName() {
		return StudentName;
	}
	
	public void setName(String name) {
		StudentName = name;
	}
	
	public int getStudentId() {
		return StudentId;
	}
	
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
}
