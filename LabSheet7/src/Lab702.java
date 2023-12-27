import java.util.*;
import java.text.*;
public class Lab702 {

	public static void main(String[] args) {
		DecimalFormat frmID = new DecimalFormat("00.00");
		Scanner scan = new Scanner(System.in);
		double[] score = new double [5];
		double average = 0,totalScore = 0;
		for(int i = 0;i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			totalScore += score[i];
		}
		average = totalScore/score.length;
		System.out.println("\nAverage of 5 student is "+frmID.format(average));
		int j=1;
		for(double _score:score) {
			if(_score>average) {
				System.out.println("> student "+ j++ +" ("+frmID.format(_score)+")");
			}
		}
	}

}
