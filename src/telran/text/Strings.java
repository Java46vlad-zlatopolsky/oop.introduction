package telran.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Strings   {
	/**
	 * 
	 * @param dates - array of strings containing dates in the format D/M/YYYY
	 * D  day of month without leading zero (03);
	 * < month number (1-12)
	 * YYYY - year (1980)
	 * create comparator. use only class String and interface Comparator
	 * @return array sorted by dates
	 * @throws ParseException 
	 */
	


	public static String[] sortStringsAsDates (String [] dates) throws ParseException  {
		do {
			sortArray(dates);
		}
		while (!sortArray(dates));
		return dates;
	}
	
	private static boolean sortArray(String [] dates) throws ParseException {
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

	private static int dateComparator(String date1, String date2) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	    Date d1 = format.parse(date1);
	    Date d2 = format.parse(date2);
	    
	    int res = d1.compareTo(d2);

		return res;
	}


	
}