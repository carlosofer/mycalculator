import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {
	MyCalculator calcu = new MyCalculator();
	
	
	@Test
	public void test0factorial() { // tests values for the factorial
		int actual = calcu.nfactorial(0);
		assertEquals("0!=1", actual, 1, 0);
	}
	
	@Test
	public void test6factorial() { // tests values for the factorial
		int actual = calcu.nfactorial(6);
		assertEquals("6!=720", actual, 720, 0);
	}
	
	@Test
	public void test8factorial() { // tests values for the factorial
		int actual = calcu.nfactorial(8);
		assertEquals("8!=40320", actual, 40320, 0);
	}
	
	@Test
	public void test12factorial() { // tests values for the factorial
		int actual = calcu.nfactorial(12);
		assertEquals("12!=479001600", actual, 479001600, 0);
	}

	@Test
	public void testBinarySearch12() {
		int[] array = new int[]{2, 4, 5, 8, 12, 13, 17, 20, 22, 27, 32, 36};
		MyCalculator calcu = new MyCalculator();
		int num = 12;
		int set = calcu.binarySearch(array, 12);
		assertEquals("Search num in array", set, 4, 0);
		}
	
	@Test
	public void testBinarySearch27() {
		int[] array = new int[]{2, 4, 5, 8, 12, 13, 17, 20, 22, 27, 32, 36};
		int num = 27;
		int set = calcu.binarySearch(array, 27);
		assertEquals("Search num in array", set, 9, 0);
		}

}
