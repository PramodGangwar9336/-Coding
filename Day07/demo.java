import java.util.Scanner;
class demo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter first value:");
            int a=sc.nextInt();
            System.out.print("Enter Second value:");
            int b=sc.nextInt();
            System.out.print("Enter oprator like(+,-,*,/):");
            char op=sc.next().charAt(0);
            switch(op){
           case '+':System.out.println("Addition->"+(a+b));
           break;
           case '-':System.out.println("Subtraction->"+(a-b));
           break;
           case '*':System.out.println("Multiplication->"+(a*b));
           break;
           case '/':
            if(b!=0){
                System.out.println("Division->"+(a/b));
            }else{
                System.out.println("cannot divide by 0");

            }
           break;
        default:System.out.println("invalid operator");
            }





            }



        
    
}