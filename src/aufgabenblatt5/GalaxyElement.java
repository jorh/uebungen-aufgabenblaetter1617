package aufgabenblatt5;

class GalaxyElement {
	
	private String name;
	private int groeﬂe = 200;
	private int x = 1000;
	private int y = 1000;
	
	
	public GalaxyElement(String name){
		this.setName(name);
	}
	
	public GalaxyElement(String name, int groeﬂe, int x, int y){
		this.setName(name);
		this.setGroeﬂe(groeﬂe);
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public String toString(){
		String str = getName()+" hat einen Durchmesser von "+getGroeﬂe()+ " km und befindet sich bei: "+getX()+", "+getY()+".";
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
