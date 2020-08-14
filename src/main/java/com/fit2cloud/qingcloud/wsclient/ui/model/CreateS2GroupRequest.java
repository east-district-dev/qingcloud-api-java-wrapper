package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

import java.util.List;

public class CreateS2GroupRequest extends RequestBase {
    private String group_type;//	账号的类型，为 SMB_GROUP, NFS_GROUP 类型	Yes
    private String group_name;//	权限组名称	No
    private List<String> s2_accounts;//	用户账号的ID	No
    private String description;

    public String getGroup_type() {
        return group_type;
    }

    public void setGroup_type(String group_type) {
        this.group_type = group_type;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public List<String> getS2_accounts() {
        return s2_accounts;
    }

    public void setS2_accounts(List<String> s2_accounts) {
        this.s2_accounts = s2_accounts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
