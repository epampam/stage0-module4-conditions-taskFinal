package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        System.out.println((year > 0 && month > 0 && month <= 12) ?
                ((month == 2) ? (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? 29 : 28 :
                        (month == 4 || month == 6 || month == 9 || month == 11) ? 30 : 31) : "invalid date");
    }
}