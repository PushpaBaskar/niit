import java.util.Scanner;
public class Registration {
	String r,e,u,p;
	
	
void registers()
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter your first name");
	 r=s.nextLine();
	System.out.println("enter your last name");
   	e=s.nextLine();
	System.out.println("enter your username");
	 u=s.nextLine();
	System.out.println("enter your password");
	  p=s.nextLine();
}
void display() {
	System.out.println("Firstame:" +r);
	System.out.println("Lastname:"+ e);
	
	System.out.println("Username:"+u);
	System.out.println("password:"+p);
	System.out.println("\nRegistation Success!!!");

	
	
}


}