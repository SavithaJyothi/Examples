import org.junit.Assert;
import org.testng.annotations.Test;


public class TestNg_Annotations_PriorityDep {

	@Test(priority=1)
	public void testOne()
	{
		System.out.println("In test 1");
		Assert.fail();
	}
	@Test(priority=2, dependsOnMethods="testOne")
	public void testTwo()
	{
		System.out.println("In test 2");
	}
	@Test(priority=3,dependsOnMethods="testOne", alwaysRun=true)
	public void tesThree()
	{
		System.out.println("In test 3");
	}
@Test(priority=4, dependsOnMethods="testOne", alwaysRun=true)
	public void testFour()
	{
		System.out.println("In test 4");
	}
}
