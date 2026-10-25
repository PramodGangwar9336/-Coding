
class demo{
    public static void main(String[]args){
        student s=new student("pramod",101);
        s.print();


    }
}
class student{
    String name; 
    int roll;
   
    student(String n,int r){
        name=n;
        roll=r;

    }
    void print(){
        System.out.println(name+" "+roll);
    }


}

