import java.util.Scanner;

 class table {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    number(num);
  }
  
    
    static void number(int n) {
        
        for(int i=1;i<=10;i++){

        System.out.println(i*n);

        }
    }

     
}
