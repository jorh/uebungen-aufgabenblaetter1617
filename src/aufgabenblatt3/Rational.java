package aufgabenblatt3;

public class Rational {
	private int z�hler, nenner;
	
	// Konstruktor
	
	Rational (){
		z�hler = 0;
		nenner = 1;
	}
	
	// Methoden
	public void  printRational(){
		System.out.println("Z�hler = "+z�hler);
		System.out.println("Nenner = "+nenner);
	}
	public int setZ�hler(int z�hler){
		this.z�hler = z�hler;
	}
	public int setNenner(int nenner){
		this.nenner = nenner;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
