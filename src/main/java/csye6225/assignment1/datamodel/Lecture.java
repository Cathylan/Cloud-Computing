package csye6225.assignment1.datamodel;

public class Lecture {
	private int LectureId;
	private String LectureNotes;
	private int AssignmentId;
	
	public Lecture() {
		
	}
	public Lecture(int lectureId, String lectureNotes, int assignmentId) {
		this.AssignmentId = assignmentId;
		this.LectureNotes = lectureNotes;
		this.LectureId = lectureId;
	}
	public int getLectureId() {
		return LectureId;
	}
	public void setLectureId(int lectureId) {
		LectureId = lectureId;
	}
	public String getLectureNotes() {
		return LectureNotes;
	}
	public void setLectureNotes(String lectureNotes) {
		LectureNotes = lectureNotes;
	}
	public int getAssignmentId() {
		return AssignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		AssignmentId = assignmentId;
	}
		
}
