import java.util.Scanner;
public class login extends Registration {
	
	String uname;
	String pass;
    String y="yes";
    String n="no";
	public static void main(String[] args) {
		login l= new login();
		while(true)
		{
		l.registers();
		l.display();
		System.out.println("*******LOGIN FORM*******");
		l.login();
		l.validate();
		System.out.println("DO YOU WANT TO CONTINUE YES OR NO");
		Scanner m= new Scanner(System.in);
		String g=m.nextLine();
		if(g.equals(l.y)) {
			System.out.println("");
			
		}
		if(g.equals(l.n))
		{
			System.out.println("exit");
			System.exit(0);
		}}}
	
			void login()
			{
				Scanner q=new Scanner(System.in);
				System.out.println("Enter your username");
				uname=q.nextLine();
				System.out.println("enter your password");
				pass=q.nextLine();
			}
			void validate()
			{
				if(u.equals(uname)&&p.equals(pass))
				{
				System.out.println("REGISTERD");	
				}
				else
					System.out.println("INVALID USERNAME AND PASSWORD");
			}
	
	}


