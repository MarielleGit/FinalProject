package pojos.US_06;

public class US_06ViceDeanPojo {
	private String httpStatus;
	private String message;
	private US_06ObjectPojo US06ObjectPojo;

	public US_06ViceDeanPojo() {
	}

	public US_06ViceDeanPojo(String httpStatus, String message, US_06ObjectPojo US06ObjectPojo) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.US06ObjectPojo = US06ObjectPojo;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setObject(US_06ObjectPojo US06ObjectPojo){
		this.US06ObjectPojo = US06ObjectPojo;
	}

	public US_06ObjectPojo getObject(){
		return US06ObjectPojo;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember06VicePojo{" + 
			"httpStatus = '" + httpStatus + '\'' + 
			",message = '" + message + '\'' + 
			",US06ObjectPojo = '" + US06ObjectPojo + '\'' +
			"}";
		}
}
