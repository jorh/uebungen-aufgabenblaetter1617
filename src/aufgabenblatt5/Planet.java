package aufgabenblatt5;

final class Planet extends GalaxyElement implements Moveable {
	
	//Richtig, kleine Anmerkung s.u.

	//Warum public? Konstanten am besten immer static machen.
	//Ansonsten wird die Konstante fuer jedes Planet-Objekt
	//extra gespeichert. Laut Konvention Konstanten dann
	//immer upper case schreiben: DREHWINKEL
	final public double drehwinkel = (Math.PI/4);
	private Sun sonne;
	private int abstand;
	private double winkel = drehwinkel;


	public Planet(String name, int groeße, Sun sonne) {
		super(name, groeße, sonne.getX()+1000, sonne.getY());
		this.sonne = sonne;
		abstand = 1000;

	}

	public Planet(String name, int groeße, Sun sonne, int abstand) {
		super(name, groeße, sonne.getX()+abstand, sonne.getY());
		this.sonne = sonne;
		this.abstand = abstand;
	}
	
	@Override
	public String toString(){
		String str = "\nPlanet "+super.toString();
		str = str+"\nEnfernung zum Stern "+sonne.getName()+": "+abstand+" km";
		return str;
	}
	
	public void move(){
		setX(abstand*Math.cos(winkel)+sonne.getX());	
		setY(abstand*Math.sin(winkel)+sonne.getY());
		System.out.println(getName()+" hat sich bewegt");
		winkel = winkel+drehwinkel;
	}
}
