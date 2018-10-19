package csye6225.assignment1.datamodel;

public class Program {

	private String ProgramName;
	private Course[] Courses;

	public Program() {
		
	}
	public Program(String programName, Course[] courses) {
		this.ProgramName = programName;
		this.Courses = courses;
	}
	public String getProgramName() {
		return ProgramName;
	}
	public Course[] getCourses() {
		return Courses;
	}

	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public void setCourses(Course[] courses) {
		this.Courses = courses;
	}
	
}