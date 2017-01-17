package aufgabenblatt5;

final class Sun extends GalaxyElement {

	public Sun(String name) {
		super(name);
	}

	public Sun(String name, int groeﬂe, int x, int y) {
		super(name, groeﬂe, x, y);
	}
	
	@Override
	
	public String toString(){
		return "Die Sonne "+ super.toString();
	}
}
