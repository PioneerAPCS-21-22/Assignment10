
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Joe Shmo", 90000.00);
        Employee e2 = new Employee("Julia Schmidt", 100000.00);
        
        String name = e1.getName();
        System.out.println("Name of employee e1: " + name);
        double salary = e1.getSalary();
        System.out.println("Salary of " + name + " is " + salary);
        e1.giveRaise(5000.0);
        salary = e1.getSalary();
        System.out.println("Salary of " + name + " is " + salary);
        
        String name2 = e2.getName();
        e2.giveRaise(2000.00);
        double salary2 = e2.getSalary();
        System.out.println("Salary of " + name2 + " is " + salary2);
        
    }
}
