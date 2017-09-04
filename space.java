
public class space {
public static void main(String[] args) {
	String str="    wel    come    ";
	System.out.println(str.length());
	str=str.trim();
	System.out.println(str.length());
	String s=str.replaceAll("\\s","");
	System.out.println(s.length());
}
}
