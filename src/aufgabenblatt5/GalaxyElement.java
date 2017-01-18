package aufgabenblatt5;

class GalaxyElement {
	
	private String name;
	private int groeﬂe = 200;
	private double x = 1000;
	private double y = 1000;
	
	
	public GalaxyElement(String name){
		this.setName(name);
	}
	
	public GalaxyElement(String name, int groeﬂe, double x, double y){
		this.setName(name);
		this.setGroeﬂe(groeﬂe);
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public String toString(){
		String str = getName()+": \n";
		str = str+"Durchmesser: "+getGroeﬂe()+ " km \n";
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

	public int getGroeﬂe() {
		return groeﬂe;
	}

	public void setGroeﬂe(int groeﬂe) {
		this.groeﬂe = groeﬂe;
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
