import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopDriver {

	static BevShop Bev;
	BevShop bev1 = new BevShop();
	
	@BeforeEach
	void setUp() throws Exception {
		Bev= new BevShop();
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		Bev = null;
	}
	
	@Test 
    public void testValidtime() 
    { 
             assertTrue(Bev.isValidTime(8)); 
             assertTrue(Bev.isValidTime(23)); 
             assertFalse(Bev.isValidTime(7)); 
             assertFalse(Bev.isValidTime(24)); 
    }
	
	@Test
	public void testValidage()
	{
		assertFalse(Bev.isValidAge(21)); 
		assertTrue(Bev.isValidAge(27)); 
	}
	
	@Test
	public void testFruit()
	{
		assertTrue(Bev.isMaxFruit(25));
		assertTrue(Bev.isMaxFruit(40));
	}
	
}
	