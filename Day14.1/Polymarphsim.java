
//compile time 







//Runtime


class Animal{
    void sound(){
        System.out.println("Animal is sound");
    }

}
class Dog extends Animal{
      void sound(){
        System.out.println("Dog is bark");
    }

}class cat extends Animal{
      void sound(){
        System.out.println("cat is mewo");
    }

}

class Polymarphsim{
    public static void main(String[]args){
        Animal a;
        a=new Dog();
        a.sound();
        a=new cat();
        a.sound();

    }
}