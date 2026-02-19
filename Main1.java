
class College {

    int classrooms = 10;
    int labs = 6;
    int faculties = 50;
    int students = 1000;
}

class Department extends College {

    String Domain = "Information Technology";
    String Goal = "Developer";
    int Strength = 150;
    int room = 4;
}

class Student extends Department {

    int rollno = 60;
    String name = "Varshini";
    int rank = 8;
}

class Main1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Roll No: " + student1.rollno);
        System.out.println("Name: " + student1.name);
    }
}
