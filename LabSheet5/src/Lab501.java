import java.util.*;
public class Lab501 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("full name : ");
		String fullName = scan.nextLine();
		int countSpace = 0;
		int space = fullName.indexOf(" ");
		if(space==-1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstName = fullName.substring(0,space);
			String lastName = fullName.substring(space+1);
			System.out.println("First Name: "+firstName.toUpperCase());
			System.out.println("Last Name : "+lastName.toLowerCase());
			}
		}	
	}
		
