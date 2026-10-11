import java.util.Scanner;
class demo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=7;
        System.out.println("enter your gess number:");
        int gess=sc.nextInt();
        if(gess==number){
            System.out.println("currect number");
        }
        else if(gess<number){
            System.out.println("number is over");

        }else{
             System.out.println("number is not equal");
        }

        

    }
}