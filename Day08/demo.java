import java.util.Scanner;
class demo{
    public static void main(String[]args){
        Student s=new Student("pramod",175,19);
        Student s1=new Student("Shiv",176,19);
        Student s2=new Student("Ansh",177,19);
        Student s3=new Student("Luppi",178,19);
        s.print();
         s1.print();
          s2.print();
           s3.print();

    }
}
class Student{
    String name;
    int roll;
    int age;
       
 Student(String n,int r,int a){
    this.name=n;
    this.roll=r;
    this.age=a;
 }
   void print(){
   System.out.println("Name->"+name+" "+"RollNumber->"+roll+" "+"Age->"+age);
   
   }


}