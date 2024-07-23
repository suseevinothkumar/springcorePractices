package org.example.ConfigBased.AnnotationBased.ApplicationContext;

import org.springframework.stereotype.Component;
//@Repository
//@Service
@Component("customer")
public class Customer {
    private int customerId;

    private String customerName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
