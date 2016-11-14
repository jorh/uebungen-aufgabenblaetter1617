package aufgabenblatt2;

import org.junit.*;


import uebung3.MyWurzel;

public class MyTest {
	@Before

	@Test
	public void testMathExpVsMyExp(){
			Assert.assertEquals(Math.exp(5.0),Euler.myExp(5,20), .1);
			for(int i = 1; i<= 20; i++){
				Assert.assertEquals(Math.exp(1.),Euler.myExp(1,i), 5);
				System.out.println("Fehlerterm:" +(Math.exp(1)-Euler.myExp(1, i)));
				System.out.println("n="+i);
			}
	
	}
}
