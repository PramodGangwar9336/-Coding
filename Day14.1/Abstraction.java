// interface student{
//     void start();
// }
// class Pramod implements student{
//    public void start(){
//         System.out.println("Pramod start");
//     }
// }
// class Abstraction{
//     public static void main(String[]agrs){
//         student s=new Pramod();
//         s.start();
//     }
// }


abstract class Animal{
    abstract void start();
      void eat(){
        System.out.println("Animal is eating");
      }

}class Dog extends Animal{
    void start(){
        System.out.println("Dog is start");

    }

}
class Abstraction{
    public static void main(String[]args){
        Dog d=new Dog();
        d.start();
        d.eat();

    }
}