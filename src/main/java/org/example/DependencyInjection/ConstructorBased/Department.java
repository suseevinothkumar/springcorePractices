package org.example.DependencyInjection.ConstructorBased;

public class Department {

    private int deptID;
    private String deptName;

    public Department(int deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
    }
    public void getDeptDetails(){
        System.out.println("Dept Name:"+deptName +" DepatID: "+deptID);
    }
}
