import java.util.Scanner;
public class facts {
	
	public static void main(String[] args)
	{
		int fact=1;
		String ansy="yes";
		String ansn="no";
		while(true) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int a=s.nextInt();
		for(int i=1;i<=a;i++)	
		{
			fact=fact*i;
		}
		System.out.println("The factorial is"+fact);
		fact=1;
		System.out.println("do to want to continue y or n");
		String b=s.next();
	if(b.equals(ansy))
	{
		System.out.println("");
		
	}
		
	if(b.equals(ansn))
	{
		System.out.println("exit");
		System.exit(0);
		
		
	}
		}
	}
}
