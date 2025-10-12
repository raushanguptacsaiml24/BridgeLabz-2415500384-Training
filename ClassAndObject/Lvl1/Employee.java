class Employee_ {
    
    String name;
    int id;
    double salary;

    Employee_(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : ₹" + salary);
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee_ emp1 = new Employee_("Raushan", 101, 50000.0);
        Employee_ emp2 = new Employee_("Amit", 102, 60000.0);

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}
