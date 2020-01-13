import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class TestStudentMaxMark {

	@Test
	public void testRight() {
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE); 
		int actualValue= s.maxMark(); 
		int expectedValue=10; 
		assertEquals("test normal set of marks", expectedValue, actualValue); 
	}

	@Category(SlowTest.class)
	@Test
	public void testCrossCheck() {
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE); 
		int actualValue= s.maxMark(); 
		int expectedValue=s.maxMark2(); 
		assertEquals("test normal set of marks", expectedValue, actualValue); 
	}

	 @Test 
	 public void testInverseRelationship() {
		 int[] marks= {10, 6, 9, 8}; 
			Student s= new Student("Gigel", 20,
					marks, EFaculty.CSIE); 
		int actualValue = s.maxMark(); 
		for(int i=0; i<marks.length; i++) {
				if(marks[i]==actualValue)
				i++; 
		assertNotEquals(marks[i], actualValue);
	 }
}

	 @Test
	 public void testPerformance1() {
		 int[] marks= {10, 6, 9, 8}; 
			Student s= new Student("Gigel", 20,
					marks, EFaculty.CSIE); 
			long startTime=System.currentTimeMillis(); 
			s.maxMark(); 
			long endTime= System.currentTimeMillis(); 
			long maxTime=5; 
			assertTrue(maxTime>=endTime-startTime);
	 }
}


