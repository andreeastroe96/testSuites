import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(SlowTest.class)
@SuiteClasses({ TestStudentConstructor.class, TestStudentMaxMark.class, TestStudentSetAge.class,
		TestStudentSetFaculty.class })
public class AllTestExceptSlowTest {

}
