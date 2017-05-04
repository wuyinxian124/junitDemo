package com.data.tencent.springJunit;

/**
 * Created by runzhouwu on 2017/5/4.
 */

public class AccountDao  {

    public void saveAccount(Account account) {
        String sql = "insert into tbl_account(id,name,age,sex) " +
                "values(:id,:name,:age,:sex)";
        System.out.println("save---scu " + sql);
    }

    public Account getAccountById(int id) {
        String sql = "select id,name,age,sex from tbl_account where id=:id";
        System.out.println("select===" + sql);
        return new Account(1,"ma",12,"male");
    }

}