package com.data.tencent.springJunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* AccountService Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 4, 2017</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-config.xml")
public class AccountServiceTest1 {

    @Autowired
    private AccountService service;

    @Test
    public void testGetAcccountById() {
        System.out.println("111");
        Account acct = Account.getAccount(1, "user01", 18, "M");
        service.insertIfNotExist(acct);
        Account acct2 = service.getAccountById(1);
//        assertEquals(acct,acct2);
        System.out.println(acct2);
    }
}
