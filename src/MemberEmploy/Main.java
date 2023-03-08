package MemberEmploy;

import MemberEmploy.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Rahul", 25, "7645833848", "Noida", 25631.5, "IT");
        Manager manager = new Manager("Shiva", 30, "8969293814", "Delhi", 69586.5, "IT");

        employee.printSalary();
        manager.printSalary();
    }


}
