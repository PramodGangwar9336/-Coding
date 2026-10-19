import java.io.File;
import java.io.IOException;

class demoo {
    public static void main(String[] args)
            throws IOException {

        File f = new File("test.txt");

        if (f.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }
    }
}