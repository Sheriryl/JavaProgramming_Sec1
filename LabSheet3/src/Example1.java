import javax.swing.*;//import library for input data from Dialog box
public class Example1 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		//Intput and convert data from dialog box
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double priceAfterdiscount , totalPrice = 0;
		//calculate total price of buffet
		totalPrice = BUFFET * numberofCustomer;
		//using showMessage dialog box for display totalPrice
		//JOptionPane.showMessageDialog(null, "Amount to be paid is "+totalPrice+"baht.");
		//using Confirm dialog box
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is "  + String.format("%.1f",totalPrice) + " baht. " + "\nDo you have a member card?");
			
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		memberCard = JOptionPane.showConfirmDialog(null, "Total price is " + totalPrice + "baht. " + "\nDo you have a member card?");
		if(memberCard==JOptionPane.YES_OPTION) {
			//discount = totalPrice -(totalPrice*10/100)
			priceAfterdiscount = totalPrice * 90 / 100; //discount 10%
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ String.format("%.1f",priceAfterdiscount)+" baht.");
		}//end of if
		else if(memberCard==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ String.format("%.1f",totalPrice)+" baht.");
		}//end else if
		
	}

}
