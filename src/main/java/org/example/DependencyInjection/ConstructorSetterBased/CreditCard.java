package org.example.DependencyInjection.ConstructorSetterBased;

public class CreditCard {

    private String bankName;
    private long balance;

    public CreditCard(String bankName, long balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    public void getCreditCard(){
        System.out.println("Credit card bank name:"+bankName+" | Customer balance:"+balance);
    }
}
