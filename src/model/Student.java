package model;


//modelu klase 
public class Student {
	//mainigie
	
	private long studentID;
	private String name;
	private String surname;
	private String personCode;
	
	private static long counter = 0;
	
	//funkcijas
	//get
	public long getStudentID() {
		return studentID;
	}
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	public String getPersonCode() {
		return personCode;
	}
	
	//set ==============
	public void setStrudentID() {
		studentID = counter;
		counter++;
	}
	public void setName(String newName) {
		if((newName != null) && (!newName.isEmpty()) && (newName.matches("[A-Z]{1}[a-z]{2,20}([ ]{1}[A-Z]{1}[a-z]{2,20})?"))) {
			name = newName;
		}
		else {
			name = "Unknown";
		}
	}
	public void setSurname(String newSurname) {
		if((newSurname != null) && (!newSurname.isEmpty()) && (newSurname.matches("[A-Z]{1}[a-z]{2,20}"))) {
			surname = newSurname;
		}
		else {
			surname = "Unknown";
		}
		
	}
	public void setPersonCode(String newPersonCode){
		if ((newPersonCode.length() == 11) && (newPersonCode != null) && (newPersonCode.matches("[1-9]{5}[-]{1}[1-9]{5}"))) {
			personCode = newPersonCode;
		}
		else {
			personCode = "Unknown";
		}
	}
	
	//bezargumenta konst
	Public Student();
	//argumenta konst
	Public Student
	//toString funkcija
	//visas parejas funkcijas pec nepieciesamibas
}
