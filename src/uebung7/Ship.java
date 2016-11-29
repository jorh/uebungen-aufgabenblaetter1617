package uebung7;

public class Ship implements CanMoveHorizontally {

	private double x,y;
	private double speed = 0;
	private String name;
	private double rad = Math.PI;

	public Ship(String name, double x, double y){
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void move() {
		y = y+Math.sin(rad)*speed;
		x = x+Math.cos(rad)*speed;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		speed = speed+by;
	}

	@Override
	public void turnBy(double radians) {
		rad = rad + radians;
	}
	
	@Override
	public String toString(){
		return ("Name: "+getName()+" Position x: "+x+" Position y: "+y);
	}
	

}
