import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		int sales;
		double salary;
		Scanner scan = new Scanner(System.in);
		DecimalFormat frmID = new DecimalFormat("##,###.00");
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales =scan.nextInt();
			if(sales == SENTINEL) {
				System.out.print("bye");
				break;
			}
			salary = 1000+(sales*COMMISSION_RATE);
			System.out.print("Salary is: "+ frmID.format(salary) + "\n");
			
		}
		
	}

}
