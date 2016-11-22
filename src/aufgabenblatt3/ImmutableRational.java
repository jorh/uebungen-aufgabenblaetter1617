package aufgabenblatt3;

class ImmutableRational {
	double z�hler, nenner;
	// TODO fuelle diese Klasse mit den Methoden von Aufgabenblatt 3
	public ImmutableRational (){
		z�hler = 333;
		nenner = 777;
	}
	
	public ImmutableRational (double z�hler, double nenner){
		this.z�hler = z�hler;
		this.nenner = nenner;
	}
	
	void  printRational(double z�hler, double nenner){
		System.out.println("Der Bruch lautet: "+z�hler+"/"+nenner);
	}
	
	double getZ�hler(){
		return z�hler;
	}
	
	double getNenner(){
		return nenner;
	}
	
	double negate (double zahl){
		zahl = -zahl;
		return zahl;
	}
	
	void invert(){
		double nenner2 = z�hler;
		double z�hler2 = nenner;
		printRational(z�hler2, nenner2);
	}
	
	double toDouble (){ //Berechnet den Dezimalwert von Z�hler und Nenner
		double dezimal = (z�hler/nenner);
		return dezimal;
	}
	
	void reduce(double z�hler, double nenner){
		double ggT = ggT(z�hler, nenner);
		double z�hler2 = z�hler/ggT;
		double nenner2 = nenner/ggT;
		printRational(z�hler2,nenner2);	
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
	void add (double z�hler2, double nenner2){
		z�hler = z�hler*nenner2;
		z�hler2 = z�hler2*nenner;
		nenner2 = nenner*nenner2;
		z�hler2 = z�hler+z�hler2;
		printRational(z�hler2,nenner2);	
	}
	
}
