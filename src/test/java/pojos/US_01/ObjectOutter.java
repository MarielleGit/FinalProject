package pojos.US_01;

import java.io.Serializable;

public class ObjectOutter implements Serializable {
	private ObjectInner object;
	private String message;
	private String httpStatus;

	public ObjectOutter() {
	}

	public ObjectOutter(ObjectInner object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}


	public void setObject(ObjectInner object){
		this.object = object;
	}

	public ObjectInner getObject(){
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
			"ObjectPojopojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}