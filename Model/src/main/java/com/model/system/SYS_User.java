package com.model.system;

import com.model.common.Basics;

/**
 * Created with IntelliJ IDEA.
 * User: LBfile
 * Date: 17-1-3
 * Time: 下午7:35
 * To change this template use File | Settings | File Templates.
 */
public class SYS_User extends Basics{

    private String account;
    private String name;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
