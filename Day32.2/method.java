class mat{
    void display(){
        System.out.println("This is a method in the mat class  1.");
        display1();
    }
    void display1(){
        System.out.println("This is another method in the mat class   2.");
        display2();
    }
     void display2(){
        System.out.println("This is another method in the mat class   3.");
        display3();
    }
     void display3(){
        System.out.println("This is another method in the mat class   4.");
        
    }
}





public class method {
    public static void main(String[] args) {
        mat m1 = new mat();
        m1.display();
    }
    
}
