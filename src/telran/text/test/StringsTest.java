package telran.text.test;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.Arrays;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsTest {
//	@BeforeEach
//	void setUp() throws Exception{ 
//		
//	}

	@Test
	void testSortStringsAsDates() throws ParseException {
		String [] inputDates =  {"10/08/2021", "30/12/2020", "5/08/2021"};
		String [] outputDates = {"30/12/2020", "5/08/2021", "10/08/2021"};
		
		assertTrue(Arrays.equals(outputDates, Strings.sortStringsAsDates(inputDates)));

		String [] inputDates1 =  {"2/1/2022", "1/1/2022","1/1/2022", "01/08/1945", "30/12/2020"};
		String [] outputDates1 = {"01/08/1945", "30/12/2020", "1/1/2022", "1/1/2022", "2/1/2022"};
		
		assertTrue(Arrays.equals(outputDates1, Strings.sortStringsAsDates(inputDates1)));
		
		try {
			String [] inputDates2 =  {"2022", "1/1/5/2022","1/1/2022"};
			Strings.sortStringsAsDates(inputDates2);
			
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
}


}
