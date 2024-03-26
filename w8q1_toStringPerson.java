import java.util.Scanner;

public class w8q1_toStringPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String nm = sc.nextLine();
        System.out.println("Enter year of birth: ");
        int yob = sc.nextInt();

        Person p = new Person(nm, yob);
        System.out.println(p.name);
        sc.close();
    }
}

class Person {
    String name;
    int yrBirth;

    Person() {
    }

    // constructor with argument
    Person(String name, int yrBirth) {
        this.name = name;
        this.yrBirth = yrBirth;
    }

    public String toString() {
        return "Name = " + name + " Year of Birth " + yrBirth;
    }
}

class Student extends Person {
    String major;

    // constructor
    Student(String name, int yrBirth, String major) {

        // calling super class onstrucntor with argument
        super(name, yrBirth);
        this.major = major;
    }

    public String toString() {
        return "Name = " + name + " Year of Birth " + yrBirth + " Major is " + major;
    }

}

class Instructor extends Person {
    double salary;

    // constructor
    Instructor(String name, int yrBirth, double salary) {

        // calling super class onstrucntor with argument
        super(name, yrBirth);
        this.salary = salary;
    }

    public String toString() {
        return "Name = " + name + " Year of Birth " + yrBirth + " Salary is " + salary;
    }
}
