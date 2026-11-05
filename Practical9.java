
class Employee {
    String name;
    double salary;
    static int count = 0;
    Employee() {
        this("Unknown",0.0);
    }
    
    Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
        count++;
    }

    void display() {
        System.out.println("name" + name);
        System.out.println("salary" + salary);
    }

    static void displayCount() {
        System.out.println("number of employees" + count);
    }
}

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("diksha",90000);
        Employee e3 = new Employee("bhoomi",45000);
        e1.display();
        e2.display();
        e3.display();
        Employee.displayCount();
    }
}

