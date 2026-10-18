public class overloding {

public static void main(String[]args){
    Sumcal s=new Sumcal();
    System.out.println(s.sum(5,9));
    System.out.println(s.sum(5,6,6));
    System.out.println(s.sum(5.5,5.8));
}   } 
class Sumcal{
int sum(int a,int b){
    return a+b;

}
int sum(int a,int b,int c){
    return a+b+c;
    
}
double sum(double a,double b){
    return a+b;
    
}
}