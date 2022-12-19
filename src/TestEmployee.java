import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees= new ArrayList<>();
        Employee employee1= new Employee((long) 123F,"Sory",500);
        Employee employee2= new Employee((long) 145F,"Seny",600);
        Employee employee3= new Employee((long) 157F,"Lassana",100);
        Employee employee4= new Employee((long) 100F,"Fode",900);
        Employee employee5= new Employee((long) 156F,"Sanoussy",700);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        for (Employee emp:employees) {
            System.out.println(emp.toString());
        }
        System.out.println("~~~~~~~~~~Apres augmentation du salaire ~~~~~~~~~~~~~~~~");
        employee1.setSalary(0.1+employee1.getSalary());
        employee2.setSalary(0.1+employee2.getSalary());
        employee3.setSalary(0.1+employee3.getSalary());
        employee4.setSalary(0.1+employee4.getSalary());
        employee5.setSalary(0.1+employee5.getSalary());
        for (Employee emp:employees) {
            System.out.println(emp.toString());
        }

        System.out.println("********** Display the list of employees with a salary included ********");

        for (Employee emp:employees) {
            if (emp.getSalary()>500 & emp.getSalary()<800){
                System.out.println(emp.toString());
            }
        }
    }
}