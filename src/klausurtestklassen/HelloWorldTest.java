package klausurtestklassen;

import org.junit.Assert;
import org.junit.Test;


public class HelloWorldTest {
	private static String hello = "and I say hello ...";
	private static String goodbye = "You say goodbye....";
	
	@Test
	public void testGoodbyeHello(){
		Assert.assertEquals("did not work", goodbye, HelloWorld.sayHelloGoodbye());
		
		for(int i=0; i<=50;i++){
			if(i%2==0){
				Assert.assertEquals(hello, HelloWorld.sayHelloGoodbye());
			}else{
				Assert.assertEquals(goodbye, HelloWorld.sayHelloGoodbye());
			}
			
		}
	}
	
}
