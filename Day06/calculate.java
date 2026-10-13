
class Student {
    String name;
    int roll;
    int m1, m2, m3;

    // Constructor
    Student(String name, int roll, int m1, int m2, int m3) {
        this.name = name;
        this.roll = roll;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    // Total calculate karna
    int calculateTotal() {
        return m1 + m2 + m3;
    }

    // Percentage calculate karna
    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    // Grade calculate karna
    String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 75) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 33) {
            return "D";
        } else {
            return "Fail";
        }
    }

    // Student report print karna
    void printReport() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println("Grade: " + calculateGrade());
        System.out.println("--------------------");
    }
}

class calculate {
    public static void main(String[] args) {

        Student s1 = new Student("Pramod", 101, 85, 90, 78);
        Student s2 = new Student("Rahul", 102, 45, 60, 70);
          Student s3 = new Student("Ansh", 103, 50, 62, 78);
            Student s4 = new Student("Baba", 104, 28, 68, 40);
              Student s5 = new Student("Ashu", 105, 75, 63, 50);
                Student s6 = new Student("Anmol", 106, 97, 70, 75);


        s1.printReport();
        s2.printReport();
        s3.printReport();
        s4.printReport();
        s5.printReport();
        s6.printReport();
    }
}
