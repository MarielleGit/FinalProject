package pojos.US_10;

import pojos.US_11.StudentsPojo;
import pojos.US_11.TeachersPojo;

import java.util.List;
import java.io.Serializable;

public class LessonsProgramPojo implements Serializable {
	private int lessonProgramId;
	private List<TeachersPojo> teachers;
	private List<StudentsPojo> students;
	private String startTime;
	private String stopTime;
	private String day;
	private List<LessonNamePojo> lessonName;

	public void setLessonProgramId(int lessonProgramId){
		this.lessonProgramId = lessonProgramId;
	}

	public int getLessonProgramId(){
		return lessonProgramId;
	}

	public void setTeachers(List<TeachersPojo> teachers){
		this.teachers = teachers;
	}

	public List<TeachersPojo> getTeachers(){
		return teachers;
	}

	public void setStudents(List<StudentsPojo> students){
		this.students = students;
	}

	public List<StudentsPojo> getStudents(){
		return students;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
		return stopTime;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setLessonName(List<LessonNamePojo> lessonName){
		this.lessonName = lessonName;
	}

	public List<LessonNamePojo> getLessonName(){
		return lessonName;
	}

	@Override
 	public String toString(){
		return 
			"LessonsProgramPojo{" + 
			"lessonProgramId = '" + lessonProgramId + '\'' + 
			",teachers = '" + teachers + '\'' + 
			",students = '" + students + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",day = '" + day + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			"}";
		}
}