package aufgabenblatt5;

final class Sun extends GalaxyElement {

	public Sun(String name) {
		super(name);
	}

	public Sun(String name, int groe�e, int x, int y) {
		super(name, groe�e, x, y);
	}
	
	@Override
	public String toString(){
		return "\nStern "+ super.toString();
	}
}
