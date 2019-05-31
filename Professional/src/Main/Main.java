package Main;
import java.util.*;

import AProfessional.AProfessional;

public class Main {
   public static void main(String[] args) {
	   Scanner user_input = new Scanner(System.in);
	   ArrayList<AProfessional> user = new ArrayList<>();
	   while(true) {
		   System.out.println("Please enter your name");
		   String s = user_input.next();
		   System.out.println("Enter your email");
		   String e = user_input.next();
		   System.out.println("Enter your gender M or F");
		   String g = user_input.next();
		   AProfessional author = new AProfessional(s, e, g.charAt(0));
		   if(author.emailMessage.equals("") && author.emailMessage.equals("") && author.genderMessage.equals("")) {
			   user.add(author);
		   }
		   System.out.println("");
		   System.out.println("Do you want to add more people? No? press \"n\" to stop");
		   String checker = user_input.next();
		   System.out.println("");
		   
		   if(checker.equals("n")) {
			   break;
		   }
	   }
	   for(AProfessional element : user) {
		   if(element instanceof AProfessional) {
			   AProfessional c1 = (AProfessional)element;
			   System.out.println(c1.getname());
			   System.out.println(c1.getemail());
			   System.out.println(c1.getgender());
		   }
	   }
   }
   
   
   
}