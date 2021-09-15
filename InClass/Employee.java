
public class Employee {
    private String name;
    private double salary;
    
    public Employee(String n, double s) {
        name = n;
        salary = s;
    }
    
    public void giveRaise(double raise) {
        salary = salary + raise;
    }
    
    // getters
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;   
    }
}