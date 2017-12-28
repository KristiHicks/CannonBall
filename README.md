# CannonBall

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
