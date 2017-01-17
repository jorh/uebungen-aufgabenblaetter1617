package aufgabenblatt5;

class GalaxyElement {
	
	private String name;
	private int groe�e = 200;
	private int x = 1000;
	private int y = 1000;
	
	
	public GalaxyElement(String name){
		this.setName(name);
	}
	
	public GalaxyElement(String name, int groe�e, int x, int y){
		this.setName(name);
		this.setGroe�e(groe�e);
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public String toString(){
		String str = getName()+" hat einen Durchmesser von "+getGroe�e()+ " km und befindet sich bei: "+getX()+", "+getY()+".";
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
