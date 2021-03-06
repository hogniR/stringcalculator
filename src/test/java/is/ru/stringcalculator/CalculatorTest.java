package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test
        public void testMultipleNumbers(){
    		assertEquals(9, Calculator.add("2,3,4"));
        }
	@Test
	public void testNewLineInput(){
		assertEquals(7, Calculator.add("2\n2,3"));
	}
	@Test
	public void testAnyDelimiter(){
		assertEquals(5, Calculator.add("//;\n2;3"));
	}

}
