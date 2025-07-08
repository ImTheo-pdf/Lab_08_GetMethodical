import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get SSN
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: ###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN entered: " + ssn);

        // Get M Number
        String mNum = SafeInput.getRegExString(in, "Enter your UC M Number (format: M12345)", "^(M|m)\\d{5}$");
        System.out.println("M Number entered: " + mNum);

        // Get menu choice
        String choice = SafeInput.getRegExString(in, "Enter a menu choice (O/S/V/Q)", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + choice.toUpperCase());
    }
}