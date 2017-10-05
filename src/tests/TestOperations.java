package tests;

import static org.junit.Assert.*;

import tools.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOperations {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSomme() {
		assertEquals(Operations.somme(2,3),5);
	}

}
