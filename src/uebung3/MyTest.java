package uebung3;
import org.junit.*;
	
public class MyTest {
	@Before

	@Test
	public void testMyWurzel(){
	Assert.assertEquals("Die Wurzel aus 4 ist 2", MyWurzel.sqrt(4));
	
	}
}
