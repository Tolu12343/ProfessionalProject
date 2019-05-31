package AProfessional;

public class AProfessional {
  private String name;
  private String email;
  private char gender;
  private String errorMessage;
  public String emailMessage ="";
  public String genderMessage = "";
  public String nameMessage = "";
  public boolean nameInput = false;
  public boolean emailInput = false;
  public boolean genderInput = false;
  public AProfessional(String name, String email, char gender) {
	  check(name, email, gender);
  }
  
  public void setname(String name){
	
		  for(int i=0; i< name.length(); i++) {
			  if( (int) name.charAt(i) >= 65 && (int)name.charAt(i)<=90 || (int) name.charAt(i) >= 97 && (int)name.charAt(i)<=122) {
				  nameMessage = "";
				  nameInput = true;
			  } else {
				  geterrorMessage();
				  nameInput = false;
			  }
			
		  }
		
	  
	  
  }
  public void geterrorMessage() {
	 
		  System.out.println("Your name input is wrong");
		  nameMessage = "NA";
  }
  public String getname() {
	  
	  return this.name;
  }
  
 public String getemail() {
	  
	  return this.email;
  }
 public char getgender() {
	 return this.gender;
 }

public void setgender(char gender){
	 if(gender == 'M' || gender == 'F') {
		 genderMessage = "";
		genderInput = true;
	 }
	 else {
		 System.out.println("Your gender input is wrong");
		 genderMessage = "NA";
		 genderInput = false;
	 }
}

public void setemail(String email) {
	if(email.contains(".com") && email.contains("@") ){
		emailMessage = "";
		emailInput = true;
	} else if(email.contains(".co.uk")) {
		emailMessage = "";
		emailInput = true;
	} else {
		emailMessage = "NA";
		System.out.println("your email input is wrong");
		emailInput = false;
	}
	

}

public void check(String name, String email, char gender) {
	setname(name);
	 setemail(email);
	 setgender(gender);
	if(nameInput == true && emailInput == true  && genderInput == true) {
		this.email = email;
		this.gender = gender;
		 this.name = name;
		 
		 nameInput = false;
		 emailInput = false;
		 genderInput = false;
	}
}
	  
}
