

class overriding{

    public static void main(String[] args) {

        Animal obj1 = new Animal();
        obj1.sound();

        Dog obj2 = new Dog();
        obj2.sound();

        Animal obj3 = new Dog();
        obj3.sound();
    }
} 
 class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}