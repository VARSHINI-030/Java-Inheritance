
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

class About extends Dog {

    String name = "Tommy";
    int age = 5;
}

class Hierarchical {

    public static void main(String[] args) {
        About dog1 = new About();
        System.out.println("Name: " + dog1.name);
        System.out.println("Age: " + dog1.age);
        System.out.println("Legs: " + dog1.legs);
        System.out.println("Eyes: " + dog1.eyes);
        System.out.println("Work: " + dog1.work);
        dog1.eat();
        dog1.sleep();
    }
}
