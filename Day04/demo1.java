
import java.util.Scanner;
import java.time.Year;
 class demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println("\n--- Age Calculator ---");
        System.out.println("Name: " + name);
        System.out.println("Your age is approximately: " + age + " years");

        sc.close();
    }
}
