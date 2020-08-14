package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingGroupsType;

import java.util.List;

public class DescribeS2GroupsRequest extends RequestBase {
    private List<String> s2_groups;//权限组id
    private List<String> group_types;
    private String account_name;//组名称

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public List<String> getS2_groups() {
        return s2_groups;
    }

    public void setS2_groups(List<String> s2_groups) {
        this.s2_groups = s2_groups;
    }

    public List<String> getGroup_types() {
        return group_types;
    }

    public void setGroup_types(List<String> group_types) {
        this.group_types = group_types;
    }
}

