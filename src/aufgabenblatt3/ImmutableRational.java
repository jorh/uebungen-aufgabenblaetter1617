package aufgabenblatt3;

class ImmutableRational {
	double zähler, nenner;
	// TODO fuelle diese Klasse mit den Methoden von Aufgabenblatt 3
	public ImmutableRational (){
		zähler = 333;
		nenner = 777;
	}
	
	public ImmutableRational (double zähler, double nenner){
		this.zähler = zähler;
		this.nenner = nenner;
	}
	
	void  printRational(double zähler, double nenner){
		System.out.println("Der Bruch lautet: "+zähler+"/"+nenner);
	}
	
	double getZähler(){
		return zähler;
	}
	
	double getNenner(){
		return nenner;
	}
	
	double negate (double zahl){
		zahl = -zahl;
		return zahl;
	}
	
	void invert(){
		double nenner2 = zähler;
		double zähler2 = nenner;
		printRational(zähler2, nenner2);
	}
	
	double toDouble (){ //Berechnet den Dezimalwert von Zähler und Nenner
		double dezimal = (zähler/nenner);
		return dezimal;
	}
	
	void reduce(double zähler, double nenner){
		double ggT = ggT(zähler, nenner);
		double zähler2 = zähler/ggT;
		double nenner2 = nenner/ggT;
		printRational(zähler2,nenner2);	
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
		 }
	void add (double zähler2, double nenner2){
		zähler = zähler*nenner2;
		zähler2 = zähler2*nenner;
		nenner2 = nenner*nenner2;
		zähler2 = zähler+zähler2;
		printRational(zähler2,nenner2);	
	}
	
}
