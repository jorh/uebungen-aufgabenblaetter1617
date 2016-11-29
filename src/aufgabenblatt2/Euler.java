package aufgabenblatt2;

public class Euler {
	
	//Sehr gut. Keine Anmerkungen

	public static double myExp(double x, int n) {
		// TODO berechne e^x mittels der auf Aufgabenblatt 2 angegebenen Formel
		double erg = 1;
		double fak = 1;
		double potenz = 1;
		for (int i=1;i<n;i++){
			fak = fak*i;
			potenz = potenz*x;
			erg = erg + (potenz/fak);					
		}
		System.out.println(erg);
		return erg;
	}
	public static double myExpFast(int x){
		// TODO beschleunige myExp()
	}
	
	public static void main(String[] args) {
		System.out.println("Das Ergebnis ist: "+myExp(1,1));
	}
}
