import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TestStudentSetAge {

	@Test
	public void testRigh() {
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE); 
		try {
			s.setAge(21);
			assertEquals("compare age", 21, s.getAge()); 
		} catch (ExceptionInputAge e) {
			e.printStackTrace();
			fail("for age under limits, the setter thrown an exception");
		}
	}

	@Test
	public void testException() {
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE); 
		try {
			s.setAge(16);
			fail("dindn't throw an exception when it should have");
		} catch (ExceptionInputAge e) {
			e.printStackTrace();
			assertTrue(true); 
		}
	}

	@Test
	public void testBoundaryLowestValue() {
		//testing for the age of 18
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE); 
		try {
			s.setAge(18);
			assertEquals("compare age", 18, s.getAge()); 
		} catch (ExceptionInputAge e) {
			e.printStackTrace();
			fail("for age under limits, the setter thrown an exception");
		}
	}

	
	@Category(SlowTest.class)
	@Test
	public void testInverseRelationship2() {
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE);
		try {
			s.setAge(25);
			int actualValue=25;
			for(int i=18; i<65; i++) {
				if(i==actualValue)
					i++; 
				assertNotEquals("test inverse", i, s.getAge());
			}
		} catch (ExceptionInputAge e) {
			e.printStackTrace();
			fail();
		}
	}
}
