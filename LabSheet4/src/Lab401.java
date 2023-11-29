import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int xNumber,yNumber;
		System.out.print("Input value of X : ");
		xNumber = scan.nextInt();
		System.out.print("Input value of Y : ");
		yNumber = scan.nextInt();
		while(true) {
			if(yNumber<xNumber) {
				System.out.print("Input value of Y, again : ");
				yNumber = scan.nextInt();
			}
			else{
				break;
			}
			
		}
		for (int i = xNumber+1; i <= yNumber;i++) {
				System.out.println(xNumber + "+" + i + "=" + (xNumber+=i));
			}
	}

}
