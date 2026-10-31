import org.openjdk.jol.info.ClassLayout;

class Main {
    public static void main(String[] args) {

        Student obj = new Student();

        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        System.out.println("Object Size: "
                + ClassLayout.parseInstance(obj).instanceSize()
                + " bytes");
    }
}

class Student {
    int j = 10;
    char c='P';
}