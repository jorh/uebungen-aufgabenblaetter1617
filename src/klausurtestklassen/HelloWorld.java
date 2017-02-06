package klausurtestklassen;

public class HelloWorld {
	private static boolean sayHello = false;
	
	public static String sayHelloGoodbye(){
		if(sayHello){
			sayHello = false;
			return "and I say hello ...";
		}else{
			sayHello = true;
			return "You say goodbye....";
		}
	}
}
