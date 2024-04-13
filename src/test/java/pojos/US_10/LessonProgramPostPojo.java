package pojos.US_10;

import java.util.List;
import java.io.Serializable;

public class LessonProgramPostPojo implements Serializable {
	private String day;
	private int educationTermId;
	private List<Integer> lessonIdList;
	private String startTime;
	private String stopTime;

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setEducationTermId(int educationTermId){
		this.educationTermId = educationTermId;
	}

	public int getEducationTermId(){
		return educationTermId;
	}

	public void setLessonIdList(List<Integer> lessonIdList){
		this.lessonIdList = lessonIdList;
	}

	public List<Integer> getLessonIdList(){
		return lessonIdList;
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

	public LessonProgramPostPojo() {
	}

	public LessonProgramPostPojo(String day, int educationTermId, List<Integer> lessonIdList, String startTime, String stopTime) {
		this.day = day;
		this.educationTermId = educationTermId;
		this.lessonIdList = lessonIdList;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}

	@Override
 	public String toString(){
		return 
			"LessonProgramPostPojo{" + 
			"day = '" + day + '\'' + 
			",educationTermId = '" + educationTermId + '\'' + 
			",lessonIdList = '" + lessonIdList + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			"}";
		}
}