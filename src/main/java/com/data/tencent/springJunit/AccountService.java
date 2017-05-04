package com.data.tencent.springJunit;

/**
 * Created by runzhouwu on 2017/5/4.
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class AccountService {
    private static final Log log = LogFactory.getLog(AccountService.class);

    @Autowired
    private AccountDao accountDao;

    public Account getAccountById(int id) {
        return accountDao.getAccountById(id);
    }

    public void insertIfNotExist(Account account) {
        Account acct = accountDao.getAccountById(account.getId());
        if(acct==null) {
            log.debug("No "+account+" found,would insert it.");
            accountDao.saveAccount(account);
        }
        acct = null;
    }

}
