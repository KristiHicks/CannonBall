//Cannonball.java
//Name: Kristi Hicks, hicksk2
public class Cannonball extends FireCannonball{
	private double xposition;
	private double yposition;
	private double xvelocity;
	private double yvelocity;
	private double gravity = -9.81;
	
	public Cannonball(double xpos, double ypos){
		xposition = xpos;
		yposition = ypos;
		xvelocity = 0.0;
		yvelocity = 0.0;
	}
	
	private void move(double sec){ 
		double xdist = xvelocity * sec;
		double ydist = yvelocity * sec;
		xposition += xdist;
		yposition += ydist;
		double yv = gravity * sec;
		yvelocity += yv;
		return;
	}
	
	public void shoot(double a, double v){
		xvelocity = v * Math.cos(Math.toRadians(a));
		yvelocity = v * Math.sin(Math.toRadians(a));
		do{
			move(0.1);
			System.out.print("xpos: " + xposition + " ");
			System.out.println(" ypos: " + yposition + " ");
		}while(yposition >0);
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