package commonLib;

import org.springframework.stereotype.Component;
//Example of ComponentScan Annotation
@Component
public class Transaction {

    private String paymentMethod;

    public Transaction(){
        this.paymentMethod = "UPI";
    }
    public void getPaymentMethod(){
        System.out.println("Payment Method:"+ paymentMethod);
    }
}
