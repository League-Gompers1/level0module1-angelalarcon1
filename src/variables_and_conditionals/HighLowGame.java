package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {
	public static void main(String[] args) {
		Random randy = new Random();
		int x = randy.nextInt(101) + 1;
		{

			String answer = JOptionPane.showInputDialog("Enter a Number between 1 and 100");
			int ansAsInt = Integer.parseInt(answer);
			for (int i = 0; i < 10; i++) {

				
				if (ansAsInt > x) {
					answer = JOptionPane.showInputDialog(null, "Guess Lower");
					ansAsInt = Integer.parseInt(answer);
				}
				if (ansAsInt < x) {
					answer = JOptionPane.showInputDialog(null, "Guess Higher");
					ansAsInt = Integer.parseInt(answer);
				}
			}
		}
	}

}
