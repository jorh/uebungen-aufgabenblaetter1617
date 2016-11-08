package uebung3;
import org.junit.*;
	
public class MyTest {
	@Before

	@Test
	public void testMyWurzel(){
		Assert.assertEquals("Die Wurzel aus 4 ist 2", MyWurzel.sqrt(4));
		Assert.assertEquals("Keine Wurzel für 5 gefunden. Die nächst größere Zahl mit einer Wurzel in den natürlichen Zahlen ist 9. Die Wurzel ist 3", MyWurzel.sqrt(5));	
	
	}
}
