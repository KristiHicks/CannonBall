//FireCannonball.java
//Name: Kristi Hicks, hicksk2
import java.util.Scanner;

public class FireCannonball {
	public static void main(String[] args){
		
		System.out.println("Please enter a starting angle: ");
	      Scanner in = new Scanner(System.in);
	      double angle = in.nextDouble();

	      System.out.println("Please enter a firing velocity: ");
	      double velocity = in.nextDouble();

	      Cannonball ball = new Cannonball(0.0, 0.0);
	      ball.shoot(angle, velocity);
	}
}
/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Lab Project 5
*
* Description:
*	This program simulates a cannonball. It takes in a user starting angle and
*	firing velocity. It also initializes the x and y positions to 0.0. It then displays
*	the x and y position of the cannonball until the yposition is 0.
*   
* Bug Report:
*   None.
*/