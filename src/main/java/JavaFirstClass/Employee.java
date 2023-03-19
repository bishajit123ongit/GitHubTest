package JavaFirstClass;

public class Employee {
    int employeeId;
    String employeeName;
    String email;
    String designation;
    double salary;
    static String companyName = "Millennium Information Solution Ltd";


    Employee() {
        System.out.println("Program started");
    }


    void assign(int employeeId, String employeeName, String email, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.designation = designation;
    }

    void output(double salary) {
        this.salary = salary;
        System.out.println("Company-->" + companyName + " EmpId -->" + employeeId + " Name-->" + employeeName + " email-->" + email + " Designation-->" + designation + " Salary-->" + salary);
    }

    static void changeCmp() {
        companyName = "BracIT";
        System.out.println("Company name changed");
        System.out.println("After the change the company name is-->" + companyName);
    }
}

class Employees {
    public static void main(String[] args) {
        double salary = 60000.500;
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.assign(423, "Bishajit Sarkar", "bishajit00@gmail.com", "QA");
        emp1.output(salary);
        Employee.changeCmp();
        emp2.assign(424, "Ovi Sarkar", "oviomps@gmail.com", "Automation");
        salary = 90000;
        emp2.output(salary);
    }
}
