package aufgabenblatt5;

final class Planet extends GalaxyElement implements Moveable {

	final public double drehwinkel = (Math.PI/4);
	private Sun sonne;
	private int abstand;
	private double winkel = drehwinkel;


	public Planet(String name, int groe�e, Sun sonne) {
		super(name, groe�e, sonne.getX()+1000, sonne.getY());
		this.sonne = sonne;
		abstand = 1000;

	}

	public Planet(String name, int groe�e, Sun sonne, int abstand) {
		super(name, groe�e, sonne.getX()+abstand, sonne.getY());
		this.sonne = sonne;
		this.abstand = abstand;
	}
	
	@Override
	public String toString(){
		String str = "Planet "+super.toString()+"\n";
		str = str+"Enfernung zum Stern "+sonne.getName()+": "+abstand+" km";
		return str;
	}
	
	public void move(){
		setX(abstand*Math.cos(winkel)+getX());	
		setY(abstand*Math.sin(winkel)+getY());
		winkel = winkel+drehwinkel;
		System.out.println(getName()+" hat sich bewegt");
	}
}
