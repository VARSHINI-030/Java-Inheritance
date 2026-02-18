
class Vehicle {

    int wheels = 4;

    void moveforward() {
        System.out.println("Moving Forward");
    }

    void movereverse() {
        System.out.println("Moving Reverse");
    }
}

class Kia extends Vehicle {

    int seat = 5;
    int mileage = 20;
}

class Main {

    public static void main(String[] args) {
        Kia car1 = new Kia();
        System.out.println("Wheels: " + car1.wheels);
        System.out.println("Seats: " + car1.seat);
        System.out.println("Mileage: " + car1.mileage);
        car1.moveforward();
        car1.movereverse();
    }
}
