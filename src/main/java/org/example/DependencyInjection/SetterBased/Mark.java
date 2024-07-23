package org.example.DependencyInjection.SetterBased;

public class Mark {
    private int mark1;
    private int mark2;

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void getMarkDetails(){
        System.out.println("Mark 1 :" +mark1);
        System.out.println("Mark 2 :" +mark2);
    }
}
