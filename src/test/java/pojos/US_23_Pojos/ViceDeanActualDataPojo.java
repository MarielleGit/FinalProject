package pojos.US_23_Pojos;

import java.io.Serializable;

public class ViceDeanActualDataPojo implements Serializable {
	private ViceDeanActualDataInnerPojo object;
	private String message;
	private String httpStatus;

	public ViceDeanActualDataPojo() {
	}

	public ViceDeanActualDataPojo(ViceDeanActualDataInnerPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ViceDeanActualDataInnerPojo object){
		this.object = object;
	}

	public ViceDeanActualDataInnerPojo getObject(){
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
			"ViceDeanActualDataPojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}