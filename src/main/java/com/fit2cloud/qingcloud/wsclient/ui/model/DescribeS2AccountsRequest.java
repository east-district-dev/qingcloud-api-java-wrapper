package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingAccountsType;

import java.util.List;

public class DescribeS2AccountsRequest extends RequestBase {
    private List<String> s2_accounts;//用户组id
    private List<String> account_types;
    private String account_name;//账户名称

    public List<String> getS2_accounts() {
        return s2_accounts;
    }

    public void setS2_accounts(List<String> s2_accounts) {
        this.s2_accounts = s2_accounts;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public List<String> getAccount_types() {
        return account_types;
    }

    public void setAccount_types(List<String> account_types) {
        this.account_types = account_types;
    }
}

