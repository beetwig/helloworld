package promptHello;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PromptHelloTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSucces() {
<<<<<<< HEAD
		System.out.println("Positive Case Junit");
		assertTrue(true);
	}
	/*
	@Test
	public void testFail() {
		System.out.println("Negative Case Junit");
		assertTrue(false);
	}
	*/
=======
		assertTrue(true);
	}
	
	@Test
	public void testFail() {
		assertTrue(false);
	}
>>>>>>> 64870a667f0079bc5189fd87b4c578d76558eb27

}
