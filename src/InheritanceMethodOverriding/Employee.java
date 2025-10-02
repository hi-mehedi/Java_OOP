package InheritanceMethodOverriding;

public class Employee {
    String  name;
    double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String calculateSalary(){
        return "Name :" + salary;
    }
}

class Manager extends Employee{
    double bonus;
    public Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    public String calculateSalary(){
        return "Name :" +(salary+bonus);
    }
}

class MainTest{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mehedi", 20000);
        System.out.println(employee1.calculateSalary());
        Employee employee = new Manager("Mehedi", 20000, 10000);
        System.out.println(employee.calculateSalary());

    }
}