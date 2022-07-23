package telran.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Strings   {



	public static String[] sortStringsAsDates (String [] dates)   {
		do {
			sortArray(dates);
		}
		while (!sortArray(dates));
		return dates;
	}
	
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

//	private static int dateComparator(String date1, String date2) throws ParseException {
//		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//
//	    Date d1 = format.parse(date1);
//	    Date d2 = format.parse(date2);
//	    
//	    int res = d1.compareTo(d2);
//
//		return res;
//	}
	
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


	
}
