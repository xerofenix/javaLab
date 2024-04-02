import java.util.Scanner;

public class w8q2_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the employee: ");
        int id = sc.nextInt();
        System.out.print("Enter the name of the employee: ");
        sc.nextLine();
        String nm = sc.nextLine();
        System.out.print("Enter the department of thr Employee: ");
        String dpt = sc.nextLine();
        System.out.print("Enter the salary of the Employee: ");
        double slr = sc.nextDouble();

        Employee emp= new Employee(id, nm, dpt, slr);

        emp.display();


    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    Employee() {

    }

    // double accepts(double sal){

    // }

    void display() {
        System.out.println("The name of the employee is " + this.name);
        System.out.println("The id of the employee is " + this.id);
        System.out.println("The department of the employee is " + this.department);
        System.out.println("The salary of the employee is " + this.salary);
    }
}

class Manager extends Employee {
    private double bonus;

    Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

void display ()
{
    System.out.println("The bonus of the Manager is "+this.bonus);
}

}
