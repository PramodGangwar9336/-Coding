class demo{
    public static void main(String args[]){
        System.out.println("Hello World");
        Student s1=new Student(20, "John");
        s1.display1();
        Student.display();
    }
}
class Student {
    String name;
    int age;

    Student(int a,  String n){
        age=a;
        name=n;
    }

    static String collage="ABC";

    static void display(){
       
        System.out.println("Collage: "+collage);
    }

        void display1(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }       
    
}