public class Employee {
    private Long number;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(Long number, String name, double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return ("Employee of the number "+number+" name is "+name+" with a salary of "+salary);
    }
}
