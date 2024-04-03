import java.util.Scanner;

public class w8q2_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the ID of the employee: ");
        String id = sc.nextLine();

        System.out.print("Enter the name of the employee: ");

        String nm = sc.nextLine();
        System.out.print("Enter the department of thr Employee: ");
        String dpt = sc.nextLine();
        System.out.print("Enter the salary of the Employee: ");
        double slr = sc.nextDouble();

        System.out.println();
        System.out.print("Enter the bonus of the Manager: ");
        double bns = sc.nextDouble();
        System.out.println();

        Manager mng = new Manager(id, nm, dpt, slr, bns);

        mng.display();
        sc.close();
    }
}

class Employee {
    private String id;
    private String name;
    private String department;
    private double salary;

    Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    Employee() {

    }

    // bcz the salary is private we cannot use it in the Manager class to add into
    // the bonus
    double accepts() {
        return this.salary;
    }

    void display() {
        System.out.println("The name of the employee is " + this.name);
        System.out.println("The id of the employee is " + this.id);
        System.out.println("The department of the employee is " + this.department);
        System.out.println("The salary of the employee is " + this.salary);
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(String id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    void display() {
        super.display();
        System.out.println("The bonus of the manager is " + this.bonus);
        System.out.println("The total salary of the manager is " + (super.accepts() + this.bonus));
    }

}
