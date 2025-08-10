import java.util.Scanner;

public class BirthdayGifts {
    boolean isLeapYear(int currentYear) {
        if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
            return true;
        } else 
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BirthdayGifts gift = new BirthdayGifts();
        // user must input valid dates otherwise program may show wrong output!!!
        System.out.print("Enter birth date (date xx xxxx): ");
        int birthDate = sc.nextInt(), birthMonth  = sc.nextInt(), birthYear  = sc.nextInt();
        System.out.print("Enter current date (xx xx xxxx): ");
        int currentDate = sc.nextInt(), currentMonth = sc.nextInt(), currentYear = sc.nextInt();
        System.out.print("Enter the num of missed birthday: ");
        int missedBday = sc.nextInt();

        int numOfBday = 0; 

        // if birth year and current year both are leap years
        if (birthDate == 29 && birthMonth == 2 && gift.isLeapYear(currentYear)) {
            if (currentMonth > 2) {
            for (int i = (birthYear + 1); i <= currentYear; i++) {
                if (gift.isLeapYear(i)) {
                    numOfBday += 1;
                    }
                }
            } else if (currentMonth == 2 && currentDate == 29) {
                for (int i = (birthYear + 1); i <= currentYear; i++) {
                if (gift.isLeapYear(i)) {
                    numOfBday += 1;
                }
            }
        } else if (currentMonth == 2 && currentDate != 29) {
                for (int i = (birthYear + 1); i < currentYear; i++) {
                if (gift.isLeapYear(i)) {
                    numOfBday += 1;
                }
            }
            } else if (currentMonth < 2) {
                for (int i = (birthYear + 1); i < currentYear; i++) {
                if (gift.isLeapYear(i)) {
                    numOfBday += 1;
                }
            }
            }
        } // if birth year is leap year but current year is not leap year
        else if (birthDate == 29 && birthMonth == 2) {        
            for (int i = (birthYear + 1); i < currentYear; i++) {
                if (gift.isLeapYear(i)) {
                    numOfBday += 1;
                }
            }
        // for normal cases
        } else if (currentDate >= birthDate && currentMonth == birthMonth) {
                numOfBday += (currentYear - birthYear);
        } else if (currentDate < birthDate && currentMonth == birthMonth) {
            numOfBday += (currentYear - birthYear - 1);
        } else if (currentMonth > birthMonth) {
                numOfBday += (currentYear - birthYear);
        } else if (currentMonth < birthMonth) {
            numOfBday += (currentYear - birthYear - 1);
        }

        int chocolate = numOfBday - missedBday;
        System.out.println("Asha will gift " + chocolate + " chocolates to her friend");

        sc.close();
    }
}
