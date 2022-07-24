package telran.text;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Strings   {


//Method receive dates array and send it for sorting. 
//If array was already sorted returns sorted array
	
	public static String[] sortStringsAsDates (String [] dates)   {
		do {
			sortArray(dates);
		}
		while (!sortArray(dates));
		return dates;
	}
	
// Method sort array with bubble sort method
	private static boolean sortArray(String [] dates)  {
		boolean isSorted = true;
		for (int i = 1; i < dates.length ; i++) {
			if (dateComparator(dates[i-1], dates[i]) > 0) {
				String rem = dates[i-1];
				dates[i-1] = dates[i];
				dates[i] = rem;
				rem = null;
				isSorted = false;
			}
		}
		return isSorted;
		
	}
	
// Date comparator method splits string according to "/" regex 
// converts string to int and compare values, returns 0, negative or positive value  
// depends of which of 2 compared values was bigger
	private static int dateComparator(String date1, String date2)  {
		int compareStartPosition = 0;
		int res = 0;
		String [] s1 = date1.split("/"); // [01][12][2010]
		String [] s2 = date2.split("/"); // [03][10][2012]
		
		if(s1.length == s2.length) {
			compareStartPosition = s1.length - 1; 
		}
		else {
			throw new IllegalArgumentException("Dates are not comparable by format");
		}
		
		for (int i = compareStartPosition; i >= 0; i-- ) {
			res = (Integer.valueOf(s1[i]) - Integer.valueOf(s2[i]));
			if (res != 0) {
				break;
			}
			continue;
		}
		return res;			
	}

	// Solution use parsing string according to SimpleDateFormat
	// Method was created for tests only
		
//		private static int dateComparator(String date1, String date2) throws ParseException {
//			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	//
//		    Date d1 = format.parse(date1);
//		    Date d2 = format.parse(date2);
//		    
//		    int res = d1.compareTo(d2);
	//
//			return res;
//		}

	
}
