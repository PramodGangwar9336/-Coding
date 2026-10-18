class encapsulation{
    public static void main(String[]args){
        Student s=new Student();
        s.setage(14);
        System.out.println(s.getage());


    }
}
class Student{
   private int age;

    public void setage(int a){
        age=a;
    }
   public int getage(){
     return age;
   }
}