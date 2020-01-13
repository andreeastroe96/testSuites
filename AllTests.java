import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestStudentConstructor.class, TestStudentMaxMark.class, TestStudentSetAge.class,
		TestStudentSetFaculty.class })

public class AllTests {

}
