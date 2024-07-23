package org.example.DependencyInjection.ConstructorBased;


public class Employee {

    //private static final Logger log = LogManager.getLogManager(Employee.class);

    private int empID;
    private String empName;

    private Department department;

    public Employee(int empID, String empName, Department department) {
        this.empID = empID;
        this.empName = empName;
        this.department = department;
    }

    public void getEmpDetails(){
        System.out.println("Employee ID:" +empID+ " Employee Name :"+empName);
        department.getDeptDetails();
    }
}
