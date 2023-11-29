import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//create object for input data from console(keyboard)
		Scanner scan = new Scanner(System.in);
		int currentNumber,prviousNumber;
		System.out.print("Input number : ");
		prviousNumber = scan.nextInt();
		while(true) {
			System.out.print("Input number : ");
			currentNumber = scan.nextInt();
			if(currentNumber<prviousNumber) {
				break;
			}
			prviousNumber = currentNumber;
		}
		System.out.print("Bye Bye ");
		/*if(currentNumber<prviousNumber) {
			System.out.print("Bye Bye ");
		}*/

	}

}
