import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter writer =
                 new FileWriter("student.txt")) {

            writer.write("Name: Pramod\n");
            writer.write("Course: BCA\n");
            writer.write("Subject: Java\n");

            System.out.println("Data written!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
