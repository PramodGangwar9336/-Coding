 import java.util.Scanner;
 class demo{
    public static void main(String[]args){
       
        Student s=new Student("pramod",52,660);
       s.print();
    }
 }
    class Student{
        String name;
        int num;
        int roll;

       Student(String m,int n,int r){
        this.name=m;
        this.num=n;
        this.roll=r;

        }
         void print(){
            System.out.println(name+" "+num+" "+roll);

        }
    }
    
