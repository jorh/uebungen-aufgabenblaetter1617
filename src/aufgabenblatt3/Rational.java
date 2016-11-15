package aufgabenblatt3;

public class Rational {
	private int zähler, nenner;
	
	// Konstruktor
	
	Rational (){
		zähler = 0;
		nenner = 1;
	}
	
	// Methoden
	public void  printRational(){
		System.out.println("Zähler = "+zähler);
		System.out.println("Nenner = "+nenner);
	}
	public void setZähler(int zähler){
		this.zähler = zähler;
	}
	public void setNenner(int nenner){
		this.nenner = nenner;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
