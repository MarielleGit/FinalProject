package pojos.US_06;

public class US_06ObjectPojo {
	private String birthDay;
	private String birthPlace;
	private String phoneNumber;
	private String gender;
	private String surname;
	private String name;
	private int userId;
	private String username;
	private String ssn;

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public US_06ObjectPojo() {
	}
	

	public US_06ObjectPojo(String birthDay, String birthPlace, String phoneNumber, String gender, String surname, String name, int userId, String username, String ssn) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.surname = surname;
		this.name = name;
		this.userId = userId;
		this.username = username;
		this.ssn = ssn;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	@Override
 	public String toString(){
		return 
			"US_06ObjectPojo{" +
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",gender = '" + gender + '\'' + 
			",surname = '" + surname + '\'' + 
			",name = '" + name + '\'' + 
			",userId = '" + userId + '\'' + 
			",username = '" + username + '\'' + 
			",ssn = '" + ssn + '\'' + 
			"}";
		}
}
