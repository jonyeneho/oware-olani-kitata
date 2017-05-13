import static org.junit.Assert.*;

import org.junit.Test;

public class TestStorehouseJide {

	@Test
	public void test() {
		Storehouse s = new Storehouse();
		
		assertEquals(0, s.getNumSeeds());
		
	}

}
