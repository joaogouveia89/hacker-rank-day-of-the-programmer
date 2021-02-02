val JANUARY = 1
val FEBRUARY = 2
val MARCH = 3
val APRIL = 4
val MAY = 5
val JUNE = 6
val JULY = 7
val AUGUST = 8
val SEPTEMBER = 9
val OCTOBER = 10
val NOVEMBER = 11
val DECEMBER = 12

fun dayOfProgrammer(year: Int): String {
    val isLeapYear = if (year < 1918)
        (year % 4 == 0)
       else
        ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
    
    var day = 1;
    var month = JANUARY;
    var currentDayOfTheYear = 1;
    
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
    
    val formattedDay = if(day / 10 > 0) "$day" else "0$day";
    val formattedMonth = if(month / 10 > 0 ) "$month" else "0$month";
    
    return  "$formattedDay.$formattedMonth.$year"
}