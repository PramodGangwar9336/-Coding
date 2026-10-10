import java.util.Scanner;

class demo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name: ");
         String name=sc.nextLine();
         System.out.print("Enter your english marks: ");
         int english=sc.nextInt();
         System.out.print("Enter your math marks: ");
         int math=sc.nextInt();
         System.out.print("Enter your hindi marks: ");
         int hindi=sc.nextInt();

         int total=english+hindi+math;
         double persant=total/3.0;

         System.out.println(name);
         System.out.println(total);
         System.out.println(persant);

         

    }
}