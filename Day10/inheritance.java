class inheritance{
    public static void main(String[]args){

        Dog s=new Dog();
        s.eat();

    }
}class Animal{
    void eat(){
        System.out.println("Eating");
    }
}
class Dog extends Animal{
      void bark(){
        
        System.out.println("Barking");
      }
}
