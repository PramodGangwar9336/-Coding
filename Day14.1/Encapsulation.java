class Encapsulation{
    public static void main(String[]args){
  student s=new student();
    s.setvalue(1000);
     s.setvalue(1000);
    System.out.println(s.getvalue()); 

    }
}
class student{
    private int balance;

    void setvalue(int balance){
         this.balance+=balance;
    }
    int getvalue(){
        return balance;
    }
}