import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String input = sc.next().toUpperCase();

        Day day = Day.valueOf(input);

        switch (day) {
            case SATURDAY, SUNDAY:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Weekday");
        }

      
    }
}
