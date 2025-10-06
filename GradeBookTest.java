import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook gb1, gb2;
	@BeforeEach
	void setUp() throws Exception {
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		gb1.addScore(90.0);
		gb1.addScore(80.0);
		gb2.addScore(100.0);
		gb2.addScore(98.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1=null;
		gb2=null;
	}

	@Test
	void testGetScoreSize() {
		//fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		//fail("Not yet implemented");
		//double expectedArray1[] = {90.0, 80.0};
		//double expectedArray2[] = {100.2, 98.0};
		assertTrue(("90.0 80.0").equals(gb1.toString()));
		assertTrue(("100.0 98.0").equals(gb2.toString()));
		assertEquals(2, gb1.getScoreSize());
		assertEquals(2, gb2.getScoreSize());
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		assertEquals(170.0, gb1.sum());
		assertEquals(198, gb2.sum());
	}

	@Test
	void testMinimum() {
		//fail("Not yet implemented");
		assertEquals(80.0, gb1.minimum());
		assertEquals(98.0, gb2.minimum());
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		assertEquals(90.0, gb1.finalScore());
		assertEquals(100.0, gb2.finalScore());
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

}
