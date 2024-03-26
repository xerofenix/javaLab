import java.util.Scanner;

public class w8q1_toStringPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String nm = sc.nextLine();
        System.out.println("Enter year of birth: ");
        String yob = sc.nextLine();

        // passing input in constructor
        Person p = new Person(nm, yob);

        System.out.println(p);

        // taking major input for student
        System.out.println("Enter your major");
        String mj = sc.nextLine();
        Student st = new Student(nm, yob, mj);
        System.out.println(st);
        // taking input for salary
        System.out.println("Enter your salary");
        double sl = sc.nextDouble();
        Instructor ins = new Instructor(nm, yob, sl);
        System.out.println(ins);
        sc.close();
    }
}

class Person {
    String name;
    String yrBirth;

    Person() {
    }

    // constructor with argument
    Person(String name, String yrBirth) {
        this.name = name;
        this.yrBirth = yrBirth;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Year of Birth " + yrBirth;
    }
}

class Student extends Person {
    String major;

    // constructor
    Student(String name, String yrBirth, String major) {

        // calling super class onstrucntor with argument
        super(name, yrBirth);
        this.major = major;
    }

    public String toString() {
        return "Name = " + name + ", Year of Birth " + yrBirth + ", Major is " + major;
    }

}

class Instructor extends Person {
    double salary;

    // constructor
    Instructor(String name, String yrBirth, double salary) {

        // calling super class onstrucntor with argument
        super(name, yrBirth);
        this.salary = salary;
    }

    public String toString() {
        return "Name = " + name + ", Year of Birth " + yrBirth + ",Salary is " + salary;
    }
}
