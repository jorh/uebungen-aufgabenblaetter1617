package aufgabenblatt5;

class GalaxyElement implements Comparable<GalaxyElement>{
	
	//Soweit richtig, kleine Anmerkung s.u.
	
	//um den Zugriff erbenden Klassen zu erlauben, waere protected hier besser
	//gewesen. Wenn du setter benutzen willst, dann stelle diese auf protected
	private String name;
	private int groeße;
	private double x;
	private double y;
	
	
	public GalaxyElement(String name){
		this.setName(name);
		groeße = 200;
		x = 1000;
		y = 1000;
	}
	
	public GalaxyElement(String name, int groeße, double x, double y){
		this.setName(name);
		this.setGroe�e(groeße);
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

	protected void setName(String name) {
		this.name = name;
	}

	public int getGroe�e() {
		return groeße;
	}

	protected void setGroe�e(int groeße) {
		this.groeße = groeße;
	}

	public double getX() {
		return x;
	}

	protected void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	protected void setY(double y) {
		this.y = y;
	}


	@Override
	public int compareTo(GalaxyElement ge) {
		if(this.getGroe�e()>ge.getGroe�e()){
			return 1;
		} else if (this.getGroe�e() == ge.getGroe�e()){
			return 0;
		} else {
			return -1;
		}

	}
}
