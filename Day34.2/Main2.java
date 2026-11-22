import java.io.*;

class Main2 {
    public static void main(String[] args)
            throws IOException {

        FileOutputStream fin =
            new FileOutputStream("inp.txt");
          String data="hellonccmdvjvdhfn";

      fin.write(data.getBytes());


        fin.close();
    }
}