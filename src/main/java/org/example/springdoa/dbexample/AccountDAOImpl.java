package org.example.springdoa.dbexample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static final Logger log = (Logger) LogManager.getLogger(AccountDAOImpl.class);

    @Override
    public int save(Account account) {
        String sql = "Insert into account(account_name, account_type) values(?,?)";
        int response = jdbcTemplate.update(sql, account.getAccountName(), account.getAccountType());
        return response;
    }

    @Override
    public int update(Account account){
        String sql="update account set account_name= ? where account_id=?";
        int response =jdbcTemplate.update(sql, account.getAccountName(), account.getAccountNo());
        return response;
    }

    @Override
    public int delete(Account account){
        String sql = "delete from account where account_id=?";
        int response=jdbcTemplate.update(sql,  account.getAccountNo());
        return response;
    }


    @Override
    public List<Account> findAllAccounts(){
        String sql = "select * from account";
        List<Account> accounts =jdbcTemplate.query(sql,new AccountRowMapper());
        return accounts;
    }



    @Override
    public Account findByAccountId(int accountNo) {
        log.info("Inside the AccountDAOImpl.findByAccountId, accountNo:{}",accountNo);

        String sql = "select * from account where account_id = ?";
        Account account = jdbcTemplate.queryForObject(sql, new AccountRowMapper(), accountNo);
        log.info("Account details, account:{}",account);
        return  account;
    }
}