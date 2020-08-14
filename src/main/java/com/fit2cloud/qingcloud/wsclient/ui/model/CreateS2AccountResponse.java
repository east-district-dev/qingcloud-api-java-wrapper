package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.ResponseBase;

public class CreateS2AccountResponse extends ResponseBase {
    private String s2_account_id;

    public String getS2_account_id() {
        return s2_account_id;
    }

    public void setS2_account_id(String s2_account_id) {
        this.s2_account_id = s2_account_id;
    }
}
