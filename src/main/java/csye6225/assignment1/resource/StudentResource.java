package csye6225.assignment1.resource;

import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import csye6225.assignment1.datamodel.Student;
import csye6225.assignment1.service.StudentService;


@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class StudentResource {
	private static StudentService students = new StudentService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Student> getAllStudent(){
		return students.getAllStudents();
	}
	
	@Path("studentResource")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@QueryParam("StudentId") int studentId){	
		return students.getStudent(studentId);
	}
	
	@POST
	public Student createStudent(Student student) {
		students.addStudent(student);
		return student;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Student putStudent(Student student) {
		students.updateStudent(student);
		return student;
	}
	@Path("remove")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Student deleteStudent(Student student) {
		students.removeStudent(student);
		return student;
	}
}

