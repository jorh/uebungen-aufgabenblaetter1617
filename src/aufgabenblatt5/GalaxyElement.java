package aufgabenblatt5;

class GalaxyElement {
	
	private String name;
	private int groe�e = 200;
	private double x = 1000;
	private double y = 1000;
	
	
	public GalaxyElement(String name){
		this.setName(name);
	}
	
	public GalaxyElement(String name, int groe�e, double x, double y){
		this.setName(name);
		this.setGroe�e(groe�e);
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public String toString(){
		String str = getName()+": \n";
		str = str+"Durchmesser: "+getGroe�e()+ " km \n";
		str = str+"Position: "+getX()+", "+getY();
		return str;
	}
	
	/*
	 * Getter and Setter
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroe�e() {
		return groe�e;
	}

	public void setGroe�e(int groe�e) {
		this.groe�e = groe�e;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
