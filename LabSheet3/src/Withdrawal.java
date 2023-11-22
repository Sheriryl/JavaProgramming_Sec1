import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;//use library for Random class
public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9)*100000;
		int withdrawal = Integer.parseInt(JOptionPane.showInputDialog("Your balance: "+ balance+"\nInput money to withdrawal."));
		DecimalFormat frm = new DecimalFormat("#,###.00");
		if(withdrawal>balance) {
		JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawal>20000) {
		JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdrawal % 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw 15 baht","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your withdrawal "+frm.format(withdrawal)+" baht."+
												"\n1,000 = " + (withdrawal/1000)+
												"\n500 = "+(withdrawal%1000)/500+
												"\n100 = "+(withdrawal%500)/100);
		}
	}

}
