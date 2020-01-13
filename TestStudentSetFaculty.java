import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudentSetFaculty {
	@Test
	public void testRigh() {
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE); 
		
			s.setFaculty(EFaculty.MK);
			assertEquals("testing set of MK", EFaculty.MK, s.getFaculty());
	}
			
		@Test
	public void testInverseRelationship() {
		
		int[] marks= {10, 6, 9, 8}; 
		Student s= new Student("Gigel", 20,
				marks, EFaculty.CSIE); 
		s.setFaculty(EFaculty.MK); 
		assertNotEquals("testing if the setter changed the faculty", EFaculty.CSIE, s.getFaculty()); 
	}
		
		@Test
		public void testInverseRelationship2() {
			
			int[] marks= {10, 6, 9, 8}; 
			Student s= new Student("Gigel", 20,
					marks, EFaculty.CSIE); 
			s.setFaculty(EFaculty.MK); 
			assertNotEquals("testing not to be CSIE", EFaculty.CSIE, s.getFaculty()); 
			assertNotEquals("testing not to be CSIE", EFaculty.FAABV, s.getFaculty()); 
			assertNotEquals("testing not to be CSIE", EFaculty.MN, s.getFaculty()); 
		}
}
