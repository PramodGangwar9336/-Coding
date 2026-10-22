class Run{
    public static void main(String[]args){
        Pramod s;
        s=new student();
        s.show();
        s=new chor();
        s.show();

    }

}
class Pramod{
    void show(){
System.out.println("Hello pramod");
    }

}

class student extends Pramod{
     void show(){
        System.out.println("Hello pramod Student");
    }

}
class chor extends Pramod{
     void show(){
        System.out.println("Hello pramod chor");
        
    }

}