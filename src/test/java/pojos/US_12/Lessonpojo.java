package pojos.US_12;

import java.util.List;
import java.io.Serializable;

public class Lessonpojo implements Serializable {
	private List<Integer> lessonProgramId;
	private int teacherId;

	public Lessonpojo() {
	}

	public Lessonpojo(List<Integer> lessonProgramId, int teacherId) {
		this.lessonProgramId = lessonProgramId;
		this.teacherId = teacherId;
	}

	public void setLessonProgramId(List<Integer> lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public List<Integer> getLessonProgramId(){
		return lessonProgramId;
	}

	public void setTeacherId(int teacherId){
		this.teacherId = teacherId;
	}

	public int getTeacherId(){
		return teacherId;
	}

	@Override
 	public String toString(){
		return 
			"Lessonpojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",teacherId = '" + teacherId + '\'' + 
			"}";
		}
}