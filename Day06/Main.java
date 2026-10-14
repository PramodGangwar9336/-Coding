
import java.util.Scanner;


class Student {
    String name;
    int rollNo;
    int[] marks = new int[5];

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void inputMarks(Scanner sc) {
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject "
                    + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println(
                    "Invalid marks! Enter marks between 0 and 100."
                );
                i--;
            }
        }
    }

    int calculateTotal() {
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    String calculateGrade() {
        double percentage = calculatePercentage();

        if (!isPassed()) {
            return "F";
        } else if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 75) {
            return "A";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 45) {
            return "C";
        } else {
            return "D";
        }
    }

    boolean isPassed() {
        for (int mark : marks) {
            if (mark < 33) {
                return false;
            }
        }

        return true;
    }

    void showResult() {
        System.out.println("\n===== STUDENT MARKSHEET =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNo);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                "Subject " + (i + 1) + "  : " + marks[i]
            );
        }

        System.out.println("Total      : "
                + calculateTotal() + "/500");

        System.out.printf("Percentage : %.2f%%%n",
                calculatePercentage());

        System.out.println("Grade      : " + calculateGrade());

        if (isPassed()) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }

        System.out.println("=============================");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        Student s1 = new Student(name, rollNo);

        s1.inputMarks(sc);
        s1.showResult();

        sc.close();
    }
}
