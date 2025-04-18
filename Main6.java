class Person {
    protected String firstName;
    protected String lastName;
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
   
    String getFirstName() {
        return firstName;
    }
   
    String getLastName() {
        return lastName;
    }
   }
   
   class E extends Person {
    private String employeeId;
    private String jobTitle;
   
   
    E(String firstName, String lastName, String employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }
   
    String getEmployeeId() {
        return employeeId;
    }
    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }
   }
   public class Main6 {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Person First Name: " + person.getFirstName());
        System.out.println("Person Last Name: " + person.getLastName());
   
        E employee = new E("Jane", "Smith", "EMP123", "Software Engineer");
        System.out.println("\nEmployee First Name: " + employee.getFirstName());
        System.out.println("Employee Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
   }