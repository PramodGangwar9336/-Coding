import java.io.*;

class Main {
    public static void main(String[] args)
            throws IOException {

        FileOutputStream fin =
            new FileOutputStream("input.txt");
          String data="hellonccmdvjvdhfn";

      fin.write(data.getBytes());


        fin.close();
    }
}