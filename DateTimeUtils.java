public class DateTimeUtils {
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    leapYear = false;
                }
            }
        }

        return leapYear;
    }


}
