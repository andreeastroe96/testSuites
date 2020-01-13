import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudentConstructor {

	@Test
	public void testRight() {
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE);
		assertEquals("Testing set of name", "Gigel", s.getName());
		assertEquals("Testing set of age", 20, s.getAge()); 
	}
	
		@Test
		public void testExistence() {
			int[] marks= {10, 6, 9, 8}; 
			Student s= new Student("Gigel", 20,
					marks, EFaculty.CSIE); 
			assertNotNull("Test if the obj was created", s);
	}
}


