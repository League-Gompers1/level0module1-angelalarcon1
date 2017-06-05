import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		
		
		
		
		
Robot r= new Robot();
int hi = 13;
String name = "bla";
Robot.setWindowColor(Color.BLACK);
r.setSpeed(10);;
r.miniaturize();	
r.penDown();
r.setPenColor(Color.blue);
r.moveTo(0, 600);
r.move(250);		
r.turn(30);	
r.move(20);
r.turn(120);	
r.move(20);
r.turn(30);
r.move(250);
r.turn(270);	
r.setPenColor(Color.GREEN);
r.move(20);	
r.setPenColor(Color.BLACK);
r.turn(-90);
r.move(300);
r.turn(90);	
r.move(20);
r.turn(90);	
r.move(300);	
r.turn(-90);	
r.setPenColor(Color.GREEN);
r.move(20);
r.setPenColor(Color.YELLOW);
r.turn(-90);
r.move(200);		
r.turn(30);	
r.move(20);
r.turn(120);	
r.move(20);
r.turn(30);
r.move(200);
r.turn(270);	
r.setPenColor(Color.GREEN);
r.move(20);	

r.setPenColor(Color.CYAN);	
r.turn(-90);
r.move(600);
r.turn(90);	
r.move(20);
r.turn(90);	
r.move(600);	
r.turn(-90);	
r.setPenColor(Color.GREEN);
r.move(20);
r.setPenColor(Color.gray);
r.turn(-90);
r.move(120);		
r.turn(30);	
r.move(20);
r.turn(120);	
r.move(20);
r.turn(30);
r.move(120);
r.turn(270);	
r.setPenColor(Color.GREEN);
r.move(20);	
r.setPenColor(Color.RED);
r.turn(-90);
r.move(500);
r.turn(90);	
r.move(20);
r.turn(90);	
r.move(500);	
r.turn(-90);	
r.setPenColor(Color.GREEN);
r.move(20);
r.setPenColor(Color.MAGENTA);
r.turn(-90);
r.move(230);		
r.turn(30);	
r.move(20);
r.turn(120);	
r.move(20);
r.turn(30);
r.move(230);
r.turn(270);
r.setPenColor(Color.GREEN);
r.move(20);	}
}
