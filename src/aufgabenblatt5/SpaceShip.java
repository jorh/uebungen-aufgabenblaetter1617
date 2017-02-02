package aufgabenblatt5;

final class SpaceShip extends GalaxyElement implements Moveable, Destroyable{
	
	//Sehr gut.

	private double vX;
	private double vY;
	private double energy = 100;
	
	public SpaceShip(String name){
		super(name, 1, 500, 700);
		setvX(20);
		setvY(20);
	}
	
	public SpaceShip(String name, int groeße, double x, double y, double vX, double vY){
		super(name, groeße, x, y);
		this.setvX(vX);
		this.setvY(vY);
	}
	
	
	@Override
	public void move() {
		setX(getX()+vX);
		setY(getY()+vY);
		System.out.println("Raumschiff "+getName()+" hat sich bewegt");
	}

	public double getvX() {
		return vX;
	}

	public void setvX(double vX) {
		this.vX = vX;
	}

	public double getvY() {
		return vY;
	}

	public void setvY(double vY) {
		this.vY = vY;
	}
	
	@Override
	public String toString(){
		String str = "\nRaumschiff "+super.toString();
		str = str+"\nGeschwindigkeit "+getvX()+", "+getvY();
		return str;
	}

	@Override
	public void hit(double power) {
		energy = energy-power;
		System.out.println("Raumschiff "+getName()+ " wurde getroffen \n"
				+ "Verbleibende Energy: "+energy);
	}

	@Override
	public boolean isDestroyed() {
		if(energy <= 0){
			System.err.print("Raumschiff "+getName()+" wurde zerstört!\n");
			return true;
		}
		return false;
	}

}
