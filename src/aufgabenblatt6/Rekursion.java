package aufgabenblatt6;

public class Rekursion {

	public static void main(String[] args) {
		int a = 36;
		int b = 20;
		System.out.println(ggT(a,b));
	}
	
	private static int ggT(int a, int b){
		System.out.print("ggT(" + a + "," + b + ") = ");
		int r=a%b;
		if(r!=0){
			ggT(b,r);
		}else{
			System.out.print("ggT(" + b + "," + r + ") = ");
		}
		// TODO calculate ggT recursively with Euklid's algorithm
		return 0;
	}

}
