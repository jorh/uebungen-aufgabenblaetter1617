package aufgabenblatt3;

//<<<<<<< HEAD
// Jonathan Rhode
// 
//=======
class Rational {
	
	//Sehr gut. Nur eine kleine Formatierung-Anmerkung :)

	// TODO fuelle diese Klasse mit den Methoden von Aufgabenblatt 3
	private double zähler, nenner;
	private double zahl;
	
	// Konstruktor
	
	private Rational (){
		zähler = 0;
		nenner = 1;
	}
	private Rational (int zähler, int nenner){
		this.zähler = zähler;
		this.nenner = nenner;
	}
	
	// Methoden
	private void  printRational(){
		System.out.println("Der Bruch lautet: "+getZähler()+"/"+getNenner());
	}
	
	private void setZähler(int zähler){
		this.zähler = zähler;
	}
	
	private void setNenner(int nenner){
		this.nenner = nenner;
	}
	
	private double getZähler(){
		return zähler;
	}
	
	private double getNenner(){
		return nenner;
	}
	
	private void negate (double zahl){
		this.zahl = -zahl;
	}
	
	private void invert(){
		double aa = zähler;
		zähler = nenner;
		nenner = aa;
	}
	
	private double toDouble (){ //Berechnet den Dezimalwert von Zähler und Nenner
		double dezimal = (zähler/nenner);
		return dezimal;
	}
	
	private void reduce(){
		double ggT = ggT(zähler, nenner);
		zähler = zähler/ggT;
		nenner = nenner/ggT;		
	}
	
	//Bestimmung des größten gemeinsamen Teilers
	private static double ggT(double zahl1, double zahl2) {
		   while (zahl2 != 0) {
		     if (zahl1 > zahl2) {
		       zahl1 = zahl1 - zahl2;
		     } else {
		       zahl2 = zahl2 - zahl1;
		     }
		   }
		   return zahl1;
		 }						//Achtung, Formatierung :)
	private void add (double zähler2, double nenner2){
		zähler = zähler*nenner2;
		zähler2 = zähler2*nenner;
		nenner = nenner*nenner2;
		zähler = zähler+zähler2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teilschritt 05
		Rational rational = new Rational(); 
		rational.setNenner(101);
		rational.setZähler(20);
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
		// Aufgabe 1.2
		ImmutableRational immutable = new ImmutableRational(25,450);
		System.out.println("--------------------------------");
		System.out.println("zweite Klasse");
		immutable.printRational(immutable.getZähler(),immutable.getNenner());
		double dezimalzahl = immutable.negate(34.565767);
		System.out.println("Negierte Zahl = "+dezimalzahl);
		System.out.println("Invertieren");
		immutable.printRational(immutable.getZähler(),immutable.getNenner());
		immutable.invert();
		immutable.printRational(immutable.getZähler(),immutable.getNenner());
		System.out.println("Dezimalwert: "+immutable.toDouble());
		System.out.println("Kürzen");
		immutable.reduce(immutable.getZähler(),immutable.getNenner());
		immutable.printRational(immutable.getZähler(),immutable.getNenner());
		System.out.println("Addieren");
		immutable.add(33, 12);
	}
}

