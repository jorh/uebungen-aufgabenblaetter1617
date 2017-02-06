package uebung3;

public class Taschenrechner {
	
	int n = 0;
	private void add(int add){
		n = n+add;
	}
	private void substract(int sub){
		n = n-sub;
	}
	private void reset(){
		n = 0;
	}
	private int getResult(){
		return n;
	}
	private void fakultaet(){
		int erg=1;
		
		while(n>0){
			erg = erg*n;
			n--;
		}
		if(n>=0){
			n = erg;
		}
		else{
			System.out.println("Aus negative Zahlen kann keine Fakultät gebildet werden!");
		}
		
	}
	private void sqrt(){
		if(n>=0){
		n = (int) Math.round(Math.sqrt(n));
		}else{
			System.out.println("Aus negative Zahlen kann keine Wurzel gezogen werden!");
		}
	}
	public static void main(String[] args) {
		Taschenrechner t = new Taschenrechner();
		t.add(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.reset();
		System.out.println("Ergebnis: " + t.getResult());
		t.add(10);
		t.substract(11);
		System.out.println("Ergebnis: " + t.getResult());
		t.fakultaet();
		System.out.println("Ergebnis: " + t.getResult());
		t.sqrt();
		System.out.println("Ergebnis: " + t.getResult());
	}
}
