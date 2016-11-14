package aufgabenblatt2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import uebung3.MyWurzel;

public class MyTest {
	@Before

	@Test
	public void testMathExpVsMyExp(){
			Assert.assertEquals(Math.exp(2), myexp(2));
	
	}
}
