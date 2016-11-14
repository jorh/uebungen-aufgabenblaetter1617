package aufgabenblatt2;

import org.junit.*;


import uebung3.MyWurzel;

public class MyTest {
	@Before

	@Test
	public void testMathExpVsMyExp(){
			//Assert.assertEquals(Math.exp(5.0),Euler.myExp(5,20), .1);
			for(double i = 1; i<= 1; i++){
				Assert.assertEquals(Math.exp(i.),Euler.myExp(i,18), .1);
				System.out.println("Fehlerterm:" +(Math.exp(i)-Euler.myExp(i, 18)));
				System.out.println("x="+i);
			}
	
	}
}
