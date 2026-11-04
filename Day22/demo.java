
interface Animal {

    void sound();

}

// Dog class
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog says: Woof Woof");
    }
}

// Cat class
class Cat implements Animal {

    public void sound() {
        System.out.println("Cat says: Meow Meow");
    }
}

// Cow class
class Cow implements Animal {

    public void sound() {
        System.out.println("Cow says: Moo Moo");
    }
}

// Main class
public class demo {

    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();
        a2.sound();
        a3.sound();

    }
}
