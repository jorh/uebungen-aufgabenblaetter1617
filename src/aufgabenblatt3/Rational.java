package aufgabenblatt3;

//<<<<<<< HEAD
// Jonathan Rhode
// 
//=======
class Rational {

	// TODO fuelle diese Klasse mit den Methoden von Aufgabenblatt 3
	private double z�hler, nenner;
	private double zahl;
	
	// Konstruktor
	
	private Rational (){
		z�hler = 0;
		nenner = 1;
	}
	private Rational (int z�hler, int nenner){
		this.z�hler = z�hler;
		this.nenner = nenner;
	}
	
	// Methoden
	private void  printRational(){
		System.out.println("Der Bruch lautet: "+z�hler+"/"+nenner);
	}
	
	private void setZ�hler(int z�hler){
		this.z�hler = z�hler;
	}
	
	private void setNenner(int nenner){
		this.nenner = nenner;
	}
	
	private void negate (double zahl){
		this.zahl = -zahl;
	}
	
	private void invert(){
		double aa = z�hler;
		z�hler = nenner;
		nenner = aa;
	}
	
	private double toDouble (){ //Berechnet den Dezimalwert von Z�hler und Nenner
		double dezimal = (z�hler/nenner);
		return dezimal;
	}
	
	private double reduce(){
		double kurz;
		return kurz;
	}
	
	private void add (double z�hler2, double nenner2){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teilschritt 05
		Rational rational = new Rational(); 
		rational.setNenner(101);
		rational.setZ�hler(20);
		rational.printRational();
		// Teilschritt 07
		rational.negate(34.565767);
		System.out.println("Negierte Zahl = "+rational.zahl);
		// Teilschritt 08
		rational.printRational();
		rational.invert();
		rational.printRational();
		// Teilschritt 09
		System.out.println("Dezimalwert: "+rational.toDouble());
		// Teilschritt 10
		
		// Teilschritt 11
	}
}
