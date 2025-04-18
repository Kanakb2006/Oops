class Employee {
    void work() {
        System.out.println("Employee is working");
    }
    double getSalary() {
        return 50000.0; // Base salary
    }
   }
   class HRManager extends Employee {
   
    void work() {
        System.out.println("HR Manager is managing HR tasks");
    }
   
    void addEmployee() {
        System.out.println("HR Manager added a new employee");
    }
   }
   public class Main3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();                                
        System.out.println("Salary: " + emp.getSalary()); 
   
        HRManager hr = new HRManager();
        hr.work();                                
        System.out.println("Salary: " + hr.getSalary()); 
        hr.addEmployee();                         
    }
   }
