package aufgabenblatt2;

public class Euler {

	public static double myExp(int x) {
		// TODO berechne e^x mittels der auf Aufgabenblatt 2 angegebenen Formel
		int erg = 1;
		int n = 5;
		int fak=1;
		for (int i=1;i<n;i++){
			fak = fak*i;
			erg = erg + (x^i/fak);			
		}
		System.out.println("Die Potenz von e hoch "+x+" ist "+ erg);
		return erg;
	}
	public static double myExpFast(int x){
		// TODO beschleunige myExp()
	}
	
	public static void main(String[] args) {
		System.out.println(myExp(2));
	}
}
