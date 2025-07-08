import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2025);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int day;

        // Use if-else to choose the correct day range based on month
        if (month == 2) {
            // February
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            // April, June, September, November
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
        } else {
            // All other months
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
        }

        int hour = SafeInput.getRangedInt(in, "Enter your birth hour (1–24)", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute (1–59)", 1, 59);

        System.out.printf("You were born on %02d/%02d/%d at %02d:%02d\n", month, day, year, hour, minute);
    }
}
