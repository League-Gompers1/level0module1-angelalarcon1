package variables_and_conditionals;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

    // 1. Make a main method that includes all the steps below….

	
	public static void main(String[] args) {
	
	Random randy = new Random();
	int x = randy.nextInt(4);
	System.out.print(x);  
	 String ans = JOptionPane.showInputDialog("Enter a Question");
    // 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	 if(ans.equals("0")){
			JOptionPane.showMessageDialog(null,yes);
			//print Yes
    // 3. Print out this variable

    // 4. Get the user to enter a question for the 8 ball

    // 5. If the random number is 0

    // -- tell the user "Yes"

    // 6. If the random number is 1

    // -- tell the user "No"

    // 7. If the random number is 2

    // -- tell the user "Maybe you should ask Google?"

    // 8. If the random number is 3

    // -- write your own answer

}
}
}