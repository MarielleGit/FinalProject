package pojos.US_08;

import java.io.Serializable;

public class US08LessonsPOJO implements Serializable {
	private ObjectPOJO object;
	private String message;
	private String httpStatus;

	public US08LessonsPOJO() {
	}

	public US08LessonsPOJO(ObjectPOJO object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPOJO object){
		this.object = object;
	}

	public ObjectPOJO getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"US08LessonsPOJO{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}