package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;
import com.fit2cloud.qingcloud.wsclient.base.ResponseBase;

public class CreateS2GroupResponse extends ResponseBase {
    private String s2_group_id;

    public String getS2_group_id() {
        return s2_group_id;
    }

    public void setS2_group_id(String s2_group_id) {
        this.s2_group_id = s2_group_id;
    }
}
