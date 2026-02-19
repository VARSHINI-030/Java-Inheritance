
class Animal {

    int legs = 4;
    int eyes = 2;

    void eat() {
        System.out.println("Eating");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

class Dog extends Animal {

    String work = "Barking";
}

class Cat extends Animal {

    String work = "Meowing";
}

public class Multilevel {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println("Legs: " + dog1.legs);
        System.out.println("Eyes: " + dog1.eyes);
        System.out.println("Work: " + dog1.work);
        dog1.eat();
        dog1.sleep();

        Cat cat1 = new Cat();
        System.out.println("Legs: " + cat1.legs);
        System.out.println("Eyes: " + cat1.eyes);
        System.out.println("Work: " + cat1.work);
        cat1.eat();
        cat1.sleep();

    }
}
