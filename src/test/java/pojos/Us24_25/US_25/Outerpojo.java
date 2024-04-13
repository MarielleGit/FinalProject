package pojos.Us24_25.US_25;

import pojos.Us24_25.US_25.ObjectInnerpojo;

import java.io.Serializable;

public class Outerpojo implements Serializable {
	private ObjectInnerpojo object;
	private String message;

	public Outerpojo() {
	}

	public Outerpojo(ObjectInnerpojo object, String message) {
		this.object = object;
		this.message = message;
	}

	public void setObject(ObjectInnerpojo object){
		this.object = object;
	}

	public ObjectInnerpojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"Outerpojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}