package org.example.DependencyInjection.SetterBased;

public class Student {
    private int studentID;
    private String studentName;
    private Mark marks;

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMarks(Mark marks) {
        this.marks = marks;
    }

    public void getStudentDetails(){
        System.out.println("Student ID:" + studentID+ " Student Name:" +studentName);
        marks.getMarkDetails();
    }
}
