package aufgabenblatt5;

class GalaxyElement implements Comparable<GalaxyElement>{
	
	//Soweit richtig, kleine Anmerkung s.u.
	
	//um den Zugriff erbenden Klassen zu erlauben, waere protected hier besser
	//gewesen. Wenn du setter benutzen willst, dann stelle diese auf protected
	private String name;
	private int groe√üe;
	private double x;
	private double y;
	
	
	public GalaxyElement(String name){
		this.setName(name);
		groe√üe = 200;
		x = 1000;
		y = 1000;
	}
	
	public GalaxyElement(String name, int groe√üe, double x, double y){
		this.setName(name);
		this.setGroeﬂe(groe√üe);
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

	protected void setName(String name) {
		this.name = name;
	}

	public int getGroeﬂe() {
		return groe√üe;
	}

	protected void setGroeﬂe(int groe√üe) {
		this.groe√üe = groe√üe;
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
		if(this.getGroeﬂe()>ge.getGroeﬂe()){
			return 1;
		} else if (this.getGroeﬂe() == ge.getGroeﬂe()){
			return 0;
		} else {
			return -1;
		}

	}
}
