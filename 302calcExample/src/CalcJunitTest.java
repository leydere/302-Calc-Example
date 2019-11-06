import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Mr. E
 *
 */
public class CalcJunitTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDivTwoInt(){
		assertTrue("Divide two ints failed.", Calc.div(10, 2)==5);
	}
	
	@Test
	public void testDivNegInt(){
		assertTrue("Divide neg ints failed.", Calc.div(-10, -2)==5);
	}
	
	@Test
	public void testMultTwoInt(){
		assertTrue("Mult two ints failed.", Calc.mult(4, 5)==20);
	}
	
	@Test
	public void testMultNegInt(){
		assertTrue("Mult neg ints failed.", Calc.mult(-10, -2)==20);
	}
	
	@Test
	public void testAddTwoInt(){
		assertTrue("Add two ints failed.", Calc.add(4, 5)==9);
	}
	
	@Test
	public void testAddNegInt(){
		assertTrue("Add neg ints failed.", Calc.add(-10, -2)==-12);
	}
	
	@Test
	public void testSubTwoInt(){
		assertTrue("Sub two ints failed.", Calc.sub(4, 5)==-1);
	}
	
	@Test
	public void testSubNegInt(){
		assertTrue("Sub neg ints failed.", Calc.sub(-10, -2)==-8);
	}

}
