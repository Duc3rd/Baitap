
class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double calculateSalary() {
        return salary;
    }
}

class OfficeEmployee extends Employee {
    int workDays;
    double dailySalary;

    public OfficeEmployee(String name, int age, int workDays, double dailySalary) {
        super(name, age);
        this.workDays = workDays;
        this.dailySalary = dailySalary;
    }

    @Override
    public double calculateSalary() {
        return workDays * dailySalary;
    }
}

class TechnicalEmployee extends Employee {
    int workHours;
    double hourlyWage;

    public TechnicalEmployee(String name, int age, int workHours, double hourlyWage) {
        super(name, age);
        this.workHours = workHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return workHours * hourlyWage;
    }
}

public class Main {
    public static void main(String[] args) {
        OfficeEmployee officeEmp = new OfficeEmployee("John", 30, 22, 100);
        TechnicalEmployee techEmp = new TechnicalEmployee("Alice", 28, 160, 15);

        System.out.println("Office Employee Salary: " + officeEmp.calculateSalary());
        System.out.println("Technical Employee Salary: " + techEmp.calculateSalary());
    }
}
