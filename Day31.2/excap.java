 class excap{
    public static void main(String args[]){
        student s = new student();
        s.setRollno(101);
        System.out.println("Roll No: " + s.getRollno());
    }
    
}
class student{
    private int rollno;
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public int getRollno(){
        return rollno;
    }
}
