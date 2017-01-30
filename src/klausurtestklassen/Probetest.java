package klausurtestklassen;

import java.util.ArrayList;
import java.util.List;

class Probetest {
	private static void zähler (){
		for (int k=0; k<20; k=k+2){
			if (k%3 ==1){
				System.out.print(k+" ");
			}
		}
	}
	
	public static void main (String[]args){
		zähler();
		System.out.print("\n");
		A a = new A();
		A b = new B();
		a.printMessage();
		b.printMessage();
		List<String> liste = new ArrayList<>();
		liste.add("falsch");
		liste.add("10");
		System.out.println(liste.size());
	}
}
