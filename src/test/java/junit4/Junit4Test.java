package junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Junit4Test {

	Junit4 junit4 = new Junit4();

	@Test
	public void stringLenghtCheckPositiveTest() {

		int actualResult = junit4.stringLenghtCheck("Rahul");
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

	@Test(expected = NullPointerException.class)
	public void stringLenghtCheckExceptionTest() {

		String str = null;
		junit4.stringLenghtCheck(str);

	}

	@Test
	public void divisionOpePositiveTest() {
		int actaulResult = junit4.divisionOpe(10, 5);

		int expectedResult = 2;

		assertEquals(expectedResult, actaulResult);
	}

	@Test(expected = ArithmeticException.class)
	public void divisionOpeExceptionTest()
	{
		junit4.divisionOpe(10, 0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void Test()
	{
		junit4.divisionOpe(10, 0);
	}

	@Test(expected = ArithmeticException.class)

	public void devTest()

	{
		junit4.divisionOpe(10, 0);
	}

	@Test(expected = ArithmeticException.class)


	public void qaTest()
	{
		junit4.divisionOpe(10, 0);
	}
	

	
	
	
	
}
