package kwakucouvrage.kawakucouvragefab;

import org.junit.Test;

public class CrunchifyFibonacciSeriesTest {
	int totalNumber = 5;
	 
	@Test
	public void testCheckFibonacciRecursion() {
		CrunchifyFibonacci.fibonacciRecusion(totalNumber);
	}
 
	@Test
	public void testCheckFibonacciLoop() {
		CrunchifyFibonacci.fibonacciLoop(totalNumber);
	}


}
