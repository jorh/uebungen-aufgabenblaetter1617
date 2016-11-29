package uebung7;

public class Helicopter implements CanMoveHorizontally, CanMoveVertically {

	private String name;
	private double x = 0;
	private double y = 0;
	private double z = 0;
	private double vSpeed = 0;
	private double hSpeed = 0;
	private double rad = 0;

	public Helicopter(String name, double x, double y, double z){
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		z = z+vSpeed;
		y = y+Math.sin(rad)*hSpeed;
		x = x+Math.cos(rad)*hSpeed;
		if(z<0){ 
			z=0;
			vSpeed = 0;
			hSpeed = 0;
			System.err.println("Helicopter ist notgelandet");
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		// TODO Auto-generated method stub
		vSpeed = vSpeed + by;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		// TODO Auto-generated method stub
		hSpeed = hSpeed+by;
	}

	@Override
	public void turnBy(double radians) {
		// TODO Auto-generated method stub
		rad = rad + radians;
	}
	
	@Override
	public String toString(){
		return ("Name: "+getName()+" Position x: "+x+" Position y: "+y+" Position z:"+z);
	}
}
