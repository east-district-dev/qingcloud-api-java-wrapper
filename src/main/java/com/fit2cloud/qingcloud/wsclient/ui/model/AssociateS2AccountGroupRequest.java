package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

import java.util.List;

public class AssociateS2AccountGroupRequest extends RequestBase {
    private String s2_group;
    private List<DescribeS2AccountsResponse.QingCloudS2Accounts> s2_accounts;

    public String getS2_group() {
        return s2_group;
    }

    public void setS2_group(String s2_group) {
        this.s2_group = s2_group;
    }

    public List<DescribeS2AccountsResponse.QingCloudS2Accounts> getS2_accounts() {
        return s2_accounts;
    }

    public void setS2_accounts(List<DescribeS2AccountsResponse.QingCloudS2Accounts> s2_accounts) {
        this.s2_accounts = s2_accounts;
    }
}
