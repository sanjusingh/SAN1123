import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class accountTest {

	account a1;
	@Before
	public void setup() throws Exception {
		//fail("Not yet implemented");
		a1 = new account(150);
	}
	
	@Test
	public void testBalance() {
		//fail("Not yet implemented");
		assertEquals(150, a1.GetBalance());
	}

	@Test
	public void testdeposit() {
		//fail("Not yet implemented");
		a1.depositMoney(100);		
		assertEquals(250, a1.GetBalance());
	}
	
	@Test
	public void testWithdraw() {
		//fail("Not yet implemented");
		a1.WithdrawMoney(100);		
		assertEquals(50, a1.GetBalance());
	}

}
