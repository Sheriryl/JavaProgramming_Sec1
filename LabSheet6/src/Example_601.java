import javax.swing.*;
public class Example_601 {

	public static void main(String[] args) {
		inputEmail();
		
	}//end main
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
		//inputEmail = inputEmail.toLowerCase();
		boolean chkEmail = checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);
		
	}//end inputEmail()
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
			return true;
		}
		else return false;
	}//end checkEmail
	public static void displayEmail(boolean chEmail,String inEmail) {
		if(chEmail==true)//(chkEmail) 
		{
			JOptionPane.showMessageDialog(null, "your e-mail is " + inEmail);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "your e-mail is not hotmail or gmail ");
		}
	}
}
