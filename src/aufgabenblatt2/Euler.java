package aufgabenblatt2;

public class Euler {

	public static double myExp(int x) {
		// TODO berechne e^x mittels der auf Aufgabenblatt 2 angegebenen Formel
		double erg = 1;
		int n = 10;
		double fak = 1;
		double potenz = 1;
		for (int i=1;i<n;i++){
			fak = fak*i;
			potenz = potenz*x;
			System.out.println("fak: "+fak+" "+potenz);
			erg = erg + (potenz/fak);			
			System.out.println(i+": erg: "+erg+" fak: "+fak+" i: "+i);
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
