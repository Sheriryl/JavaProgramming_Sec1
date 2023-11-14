import java.text.DecimalFormat;
import javax.swing.*;//1.import library for input data from dialog box
public class Example4 {
	public static void main(String[] args) {
		//2.input data from dialogbox
		String productName = JOptionPane.showInputDialog("Input Product Name: ");
		
/*		//input unit price from dialog box 
		String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit); */
		//input and convert data from dialog box
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		
		//input price per unit from dialog box
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		//calculate total price
		DecimalFormat frm = new DecimalFormat("#,###.00");
		float totalPrice = productUnit*pricePerUnit;
		float vat = totalPrice + (totalPrice*7/100);
		//display data to dialog box
		JOptionPane.showMessageDialog(null, "Total Price is "+frm.format(totalPrice)+" baht."+"\nAdd VAT  7% is "+frm.format(vat)+" baht.");
	}

}
