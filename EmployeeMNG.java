class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    double calculateTotalSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateTotalSalary() {
        return salary + bonus;
    }
}

// Developer class inheriting from Employee
class Developer extends Employee {
    int projectsHandled;

    Developer(String name, int id, double salary, int projectsHandled) {
        super(name, id, salary);
        this.projectsHandled = projectsHandled;
    }

    // Developers get a project allowance
    @Override
    double calculateTotalSalary() {
        double projectAllowance = 300 * projectsHandled; // suppose $300 per project
        return salary + projectAllowance;
    }
}

// Tester class inheriting from Employee
class Tester extends Employee {
    double allowance;

    Tester(String name, int id, double salary, double allowance) {
        super(name, id, salary);
        this.allowance = allowance;
    }

    @Override
    double calculateTotalSalary() {
        return salary + allowance;
    }
}

public class EmployeeMNG {
    public static void main(String[] args) {
        // array of Employee objects
        Employee[] employees = {
            new Manager("sikander", 102, 54000, 3500), 
            new Developer("irfan", 103, 45000, 2),
            new Tester("talat", 104, 30000, 1500)  
        };

        //  total salary for all employees
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateTotalSalary();
        }

        System.out.println("Total salary for all employees: $" + totalSalary);
    }
}
