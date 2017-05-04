package com.data.tencent.springJunit;

/**
 * Created by runzhouwu on 2017/5/4.
 */
public class Account {
    public static final String SEX_MALE = "male";
    public static final String SEX_FEMALE = "female";

    private int id;
    private String name;
    private int age;
    private String sex;

    public Account(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Account() {
    }

    public String toString() {
        return String.format("Account[id=%d,name=%s,age:%d,sex:%s]",id,name,age,sex);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public static Account getAccount(int id,String name,int age,String sex) {
        Account acct = new Account();
        acct.setId(id);
        acct.setName(name);
        acct.setAge(age);
        acct.setSex(sex);
        return acct;
    }
}
