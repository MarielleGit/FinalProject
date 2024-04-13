package pojos.Us24_25.US_24;

import java.io.Serializable;

public class Actualpojo implements Serializable {
	private String birthDay;
	private String birthPlace;
	private String phoneNumber;
	private boolean advisorTeacher;
	private String gender;
	private String surname;
	private String name;
	private int userId;
	private String email;
	private String username;
	private String ssn;

	public Actualpojo() {
	}

	public Actualpojo(String birthDay, String birthPlace, String phoneNumber, boolean advisorTeacher, String gender, String surname, String name, int userId, String email, String username, String ssn) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.phoneNumber = phoneNumber;
		this.advisorTeacher = advisorTeacher;
		this.gender = gender;
		this.surname = surname;
		this.name = name;
		this.userId = userId;
		this.email = email;
		this.username = username;
		this.ssn = ssn;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
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

	public void setAdvisorTeacher(boolean advisorTeacher){
		this.advisorTeacher = advisorTeacher;
	}

	public boolean isAdvisorTeacher(){
		return advisorTeacher;
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

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
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
			"Actualpojo{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",advisorTeacher = '" + advisorTeacher + '\'' + 
			",gender = '" + gender + '\'' + 
			",surname = '" + surname + '\'' + 
			",name = '" + name + '\'' + 
			",userId = '" + userId + '\'' + 
			",email = '" + email + '\'' + 
			",username = '" + username + '\'' + 
			",ssn = '" + ssn + '\'' + 
			"}";
		}
}