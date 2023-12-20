import java.util.*;
public class Example_603 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Plese enter your name ");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(" ");
		String firstname = fullname.substring(0,space);
		String jud = abbreviatName(fullname);
		System.out.println(": "+ jud + firstname);
	}
	public static String abbreviatName(String fullname) {
		String rere = "";
		for(int i=0;i<fullname.length()-1;i++) {
			if(fullname.charAt(i)==' ') {
				rere = rere+(fullname.charAt(i+1))+".";
			}
		}
		return rere;
	}
}
