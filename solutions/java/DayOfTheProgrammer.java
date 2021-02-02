public class DayOfTheProgrammer{

	private static int JANUARY 		= 1;
	private static int FEBRUARY 	= 2;
	private static int MARCH 		= 3;
	private static int APRIL 		= 4;
	private static int MAY 			= 5;
	private static int JUNE 		= 6;
	private static int JULY 		= 7;
	private static int AUGUST 		= 8;
	private static int SEPTEMBER 	= 9;
	private static int OCTOBER 		= 10;
	private static int NOVEMBER 	= 11;
	private static int DECEMBER 	= 12;

	public static String run(int year){
		boolean isLeapYear = (year < 1918) ? (year % 4 == 0) : ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
		int currentDayOfTheYear = 1;
		int day = 1;
		int month = JANUARY;
		String formattedDay;
		String formattedMonth;

		while(currentDayOfTheYear != 256){
			if(day == 31 && month == JANUARY && year == 1918){
				day = 14;
				month = FEBRUARY;
			}else if( day == 31 && (month == JANUARY || month == MARCH || month == MAY || month == JULY || month == AUGUST || month == OCTOBER || month == DECEMBER) ||
					day == 30 && (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) ||
					(isLeapYear && day == 29 && month == FEBRUARY) ||
					(!isLeapYear && day == 28 && month == FEBRUARY)
				){
				day = 1;
				month++;
			}else{
				day++;
			}

			currentDayOfTheYear++;
		}

		formattedDay = day / 10 > 0 ? String.valueOf(day) : ("0" + String.valueOf(day));
		formattedMonth = month / 10 > 0 ? String.valueOf(month) : ("0" + String.valueOf(month));
		return formattedDay + "." + formattedMonth + "." + year;
	}
}