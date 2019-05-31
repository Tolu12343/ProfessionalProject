package AProfessional;

public class AProfessional {
  private String name;
  private String email;
  private char gender;
  private String errorMessage;
  
  public AProfessional(String name, String email, char gender) {
	  setname(name);
	  this.email = email;
	  setgender(gender);
  }
  
  public void setname(String name){
	  try {
		  for(int i=0; i< name.length(); i++) {
			  Integer.parseInt(Character.toString(name.charAt(i)));
		  }
		
	  } catch(NumberFormatException e) {
		   errorMessage = "error";
	  }
	  geterrorMessage();
	  
	  
  }
  public String geterrorMessage() {
	  if(errorMessage.equals("error")) {
		  System.out.println("wrong entry");
	  }
	  
	  return errorMessage;
  }
  public String getname() {
	  
	  return this.name;
  }

public void setgender(char gender){
	 if(gender != 'M' || gender != 'F') {
		 this.gender = gender;
	 }
	 else {
		 System.out.println("Error input");
	 }
}  
	  
}
