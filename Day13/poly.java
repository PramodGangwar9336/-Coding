//compile time polymerphisam

class poly{
    public static void main(String[]args){
     
 student a;
 a=new student();
 
System.out.println(a.sum(5,4));
System.out.println(a.sum(5,5,4));

    }
}
class student{
   

    int  sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }

}