
import java.io.*;
import java.util.*;

class employee {
    int empNo;
    String name;
    char sex;
    double grossSalary;

    public employee(int empNo, String name, char sex, double grossSalary) {
        this.empNo = empNo;
        this.name = name;
        this.sex = sex;
        this.grossSalary = grossSalary;
    }

    public String toString() {
        return "Employee No.: " + empNo + "\nName: " + name + "\nSex: " + sex + "\nGross Salary: " + grossSalary + "\n";
    }
}

public class w10q3_EmployeeFirm {
    static ArrayList<employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---------------Employee Management System----------------------");
            System.out.println("1. Create a file of employee data");
            System.out.println("2. Append data of a new employee");
            System.out.println("3. Delete record of an employee");
            System.out.println("4. Update gross salary of an employee");
            System.out.println("5. Display record of:");
            System.out.println("\ta) Given employee");
            System.out.println("\tb) All employees");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createEmployeeData();
                    break;
                case 2:
                    appendEmployeeData();
                    break;
                case 3:
                    deleteEmployeeRecord();
                    break;
                case 4:
                    updateGrossSalary();
                    break;
                case 5:
                    displayEmployeeRecord();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }

    static void createEmployeeData() {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("employee_data.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            System.out.print("Enter number of employees: ");
            int n = sc.nextInt();
            sc.nextLine(); // Consume newline

            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for employee " + (i + 1));
                System.out.print("Employee No.: ");
                int empNo = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Sex: ");
                char sex = sc.nextLine().charAt(0);
                System.out.print("Gross Salary: ");
                double grossSalary = sc.nextDouble();
                sc.nextLine(); // Consume newline

                employee employee = new employee(empNo, name, sex, grossSalary);
                employees.add(employee);

                bufferedWriter.write(empNo + "," + name + "," + sex + "," + grossSalary + "\n");
            }

            bufferedWriter.close();
            System.out.println("Employee data created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }

    static void appendEmployeeData() {
        try {
            FileWriter writer = new FileWriter("employee_data.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter details for new employee");
            System.out.print("Employee No.: ");
            int empNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Sex: ");
            char sex = sc.nextLine().charAt(0);
            System.out.print("Gross Salary: ");
            double grossSalary = sc.nextDouble();
            sc.nextLine(); // Consume newline

            employee employee = new employee(empNo, name, sex, grossSalary);
            employees.add(employee);

            bufferedWriter.write(empNo + "," + name + "," + sex + "," + grossSalary + "\n");

            bufferedWriter.close();
            System.out.println("New employee data appended successfully.");

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void deleteEmployeeRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee No. of the employee to delete: ");
        int empNoToDelete = sc.nextInt();
        sc.nextLine(); // Consume newline

        Iterator<employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            employee employee = iterator.next();
            if (employee.empNo == empNoToDelete) {
                iterator.remove();
                break;
            }
        }
        System.out.println("Employee record deleted successfully.");
        sc.close();
    }

    static void updateGrossSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee No. of the employee whose salary you want to update: ");
        int empNoToUpdate = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (employee employee : employees) {
            if (employee.empNo == empNoToUpdate) {
                System.out.print("Enter new gross salary: ");
                double newGrossSalary = sc.nextDouble();
                sc.nextLine(); // Consume newline
                employee.grossSalary = newGrossSalary;
                System.out.println("Gross salary updated successfully.");
                return;
            }
            sc.close();
        }
        System.out.println("Employee not found.");
    }

    static void displayEmployeeRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Display record of:");
        System.out.println("a) Given employee");
        System.out.println("b) All employees");
        System.out.print("Enter your choice: ");
        char choice = sc.nextLine().charAt(0);

        switch (choice) {
            case 'a':
                System.out.print("Enter the Employee No. of the employee to display: ");
                int empNoToDisplay = sc.nextInt();
                sc.nextLine(); // Consume newline

                for (employee employee : employees) {
                    if (employee.empNo == empNoToDisplay) {
                        System.out.println(employee);
                        return;
                    }
                }
                System.out.println("Employee not found.");
                break;
            case 'b':
                for (employee employee : employees) {
                    System.out.println(employee);
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

}