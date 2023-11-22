import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		//Input and convert height(cm.) from user
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input height: "));
		//convert height from cm. to m.
		height = height/100;
		double bmi = weight/(height*height);
		//check condition and declare meaning of BMI
		String bmiCategory;
		if(bmi<18.5) bmiCategory="Nuderweight";
		else if (bmi>18.5 && bmi<25) bmiCategory="Normal-weight";
		else if (bmi>25 && bmi<30) bmiCategory="Overweight";
		else bmiCategory="Obesity";
		JOptionPane.showMessageDialog(null,"BMI = "+String.format("%.1f",bmi)+"\nYou're "+bmiCategory);
	}

}
