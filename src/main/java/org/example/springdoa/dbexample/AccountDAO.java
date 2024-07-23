package org.example.springdoa.dbexample;

import java.util.List;

public interface AccountDAO {

    int save(Account account);

    int update(Account account);

    int delete(Account account);

    List<Account> findAllAccounts();

    Account findByAccountId(int accountNo);
}
