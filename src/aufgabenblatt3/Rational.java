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
	
	 Rational (){
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
	
	private void reduce(){
		double ggT = ggT(z�hler, nenner);
		z�hler = z�hler/ggT;
		nenner = nenner/ggT;		
	}
	
	//Bestimmung des gr��ten gemeinsamen Teilers
	private static double ggT(double zahl1, double zahl2) {
		   while (zahl2 != 0) {
		     if (zahl1 > zahl2) {
		       zahl1 = zahl1 - zahl2;
		     } else {
		       zahl2 = zahl2 - zahl1;
		     }
		   }
		   return zahl1;
		 }
	private void add (double z�hler2, double nenner2){
		z�hler = z�hler*nenner2;
		z�hler2 = z�hler2*nenner;
		nenner = nenner*nenner2;
		z�hler = z�hler+z�hler2;
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
		rational.reduce();
		rational.printRational();
		// Teilschritt 11
		rational.add(33, 12);
		rational.reduce();
		rational.printRational();
		ImmutableRational immutable = new ImmutableRational(23,455);
	}
}

