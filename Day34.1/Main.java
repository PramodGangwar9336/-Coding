// class student{
//      static String collage="lotus";

// }
// class demo{
//     public static void main(String[] args) {
//         student s1=new student();
//         System.out.println(s1.collage);
//     }
// }

// class student{
//      static int add(int a,int b){
//         return a+b;

// }}
// class demo{
//     public static void main(String[] args) {
//        int result=student.add(10,20);
//        System.out.println(result);
//     }
// }


//   class demo {

//     static {
//         System.out.println("Static Block Executed");
//     }

//     public static void main(String[] args) {
//         System.out.println("Main Method");
//     }
// }
class Outer {

    static class Inner {

        void show() {
            System.out.println("Hello Java");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Outer.Inner obj = new Outer.Inner();

        obj.show();
    }
}