package csye6225.assignment1.resource;


import java.util.Collection;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import csye6225.assignment1.datamodel.Lecture;
import csye6225.assignment1.service.LectureService;

@Path("lecture")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class LectureResource {
	private static LectureService lectures = new LectureService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Lecture> getLecLists(){	
		return lectures.getLectures();
	}
	
	@Path("lectureResource")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Lecture getLecList(@QueryParam("LectureId") Integer lectureId){
		return lectures.getLecture(lectureId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture postLecture(Lecture lecture) {
		return lecture;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture putLecture(Lecture lecture) {
		return lecture;
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public Lecture deleteLecture(Lecture lecture) {
		return lecture;
	}


}
