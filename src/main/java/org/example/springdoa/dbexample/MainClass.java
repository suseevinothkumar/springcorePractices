package org.example.springdoa.dbexample;

import org.example.springdoa.dbexample.AccountDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org/example/springdoa/dbexample");
        // Usually we put as   AccountDAOImpl accountDAO = context.getBean("accountDAOImpl",AccountDAOImpl.class);
        //But AOP requires Interface AccountDAO rather than AccountDAOImpl
        AccountDAO accountDAO = context.getBean("accountDAOImpl",AccountDAO.class);

        Account account = new Account();
        account.setAccountName("Savings");
        account.setAccountType("SD");
//
//        Account account1 = new Account();
//        account1.setAccountName("Fixed");
//        account1.setAccountType("FD");
//        accountDAO.save(account1);
//        Account account2 = new Account();
//        account2.setAccountName("Fixed");
//        account2.setAccountType("FD");
//        accountDAO.save(account2);

        Account account1=new Account();
        account1.setAccountName("New Deposit");
        account1.setAccountNo(2);
        accountDAO.update(account1);
        System.out.println("===========Updated the account========");

        Account account2 =new Account();
        account2.setAccountNo(3);
        //accountDAO.delete(account2);
        //System.out.println("===========Deleted the account========");

        List<Account> accounts=accountDAO.findAllAccounts();
       // accounts.forEach(acc -> System.out.println(acc.getAccountNo()+":"+ acc.getAccountName()+":"+acc.getAccountType()));

        Account account4 =accountDAO.findByAccountId(2);
        System.out.println(account4.getAccountNo()+":"+account4.getAccountType()+":"+account4.getAccountName());
    }
}
