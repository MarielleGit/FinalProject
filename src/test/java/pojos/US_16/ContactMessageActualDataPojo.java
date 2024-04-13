package pojos.US_16;

import java.util.List;
import java.io.Serializable;

public class ContactMessageActualDataPojo implements Serializable {
	private List<ContentPojo> content;

	public void setContent(List<ContentPojo> content){
		this.content = content;
	}

	public List<ContentPojo> getContent(){
		return content;
	}

	public ContactMessageActualDataPojo() {
	}

	public ContactMessageActualDataPojo(List<ContentPojo> content) {
		this.content = content;
	}

	@Override
 	public String toString(){
		return 
			"ContactMessageActualDataPojo{" + 
			"content = '" + content + '\'' + 
			"}";
		}
}