package pojos.US_06;

public class US_06ViceDeanPostPojo {
	private String birthDay;
	private String birthPlace;
	private String password;
	private String phoneNumber;
	private String gender;
	private String surname;
	private String name;
	private String ssn;
	private String username;

	public US_06ViceDeanPostPojo() {
	}

	public US_06ViceDeanPostPojo(String birthDay, String birthPlace, String password, String phoneNumber, String gender, String surname, String name, String ssn, String username) {
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.surname = surname;
		this.name = name;
		this.ssn = ssn;
		this.username = username;
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

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
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

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"Res{" + 
			"birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",password = '" + password + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",gender = '" + gender + '\'' + 
			",surname = '" + surname + '\'' + 
			",name = '" + name + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}
