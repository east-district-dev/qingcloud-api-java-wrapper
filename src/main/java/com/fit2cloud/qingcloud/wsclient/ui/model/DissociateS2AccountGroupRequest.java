package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

import java.util.List;

public class DissociateS2AccountGroupRequest extends RequestBase {
    private List<String> s2_groups;
    private List<String> s2_accounts;

    public List<String> getS2_groups() {
        return s2_groups;
    }

    public void setS2_groups(List<String> s2_groups) {
        this.s2_groups = s2_groups;
    }

    public List<String> getS2_accounts() {
        return s2_accounts;
    }

    public void setS2_accounts(List<String> s2_accounts) {
        this.s2_accounts = s2_accounts;
    }
}
