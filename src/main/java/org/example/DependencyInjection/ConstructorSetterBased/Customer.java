package org.example.DependencyInjection.ConstructorSetterBased;

public class Customer {

    private String customerName;
    private long phoneNumber;

    private int age;
    private String sex;

    private CreditCard credit;

    public Customer(String customerName, long phoneNumber, CreditCard credit) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.credit = credit;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getCustomer(){
        System.out.println("Customer Name:"+customerName+" | Customer PhoneNumber:"+ phoneNumber
        +" | Customer Age:"+" Sex:"+sex);
        credit.getCreditCard();
    }
}
