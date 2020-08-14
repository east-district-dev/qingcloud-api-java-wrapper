package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.ResponseBase;

import java.util.List;

public class DescribeS2GroupsResponse extends ResponseBase {
    private List<QingCloudS2Groups> s2_group_set;

    public List<QingCloudS2Groups> getS2_group_set() {
        return s2_group_set;
    }

    public void setS2_group_set(List<QingCloudS2Groups> s2_group_set) {
        this.s2_group_set = s2_group_set;
    }

    @Override
    public List getSubClassPro(){
        return s2_group_set;
    }

    public class QingCloudS2Groups{
        private String group_id;
        private String group_type;
        private String is_default;
        private String description;
        private String group_name;
        private String create_time;
        private List<DescribeS2AccountsResponse.QingCloudS2Accounts> account_set , s2_accounts;

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public String getGroup_type() {
            return group_type;
        }

        public void setGroup_type(String group_type) {
            this.group_type = group_type;
        }

        public String getIs_default() {
            return is_default;
        }

        public void setIs_default(String is_default) {
            this.is_default = is_default;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getGroup_name() {
            return group_name;
        }

        public void setGroup_name(String group_name) {
            this.group_name = group_name;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public List<DescribeS2AccountsResponse.QingCloudS2Accounts> getAccount_set() {
            return account_set;
        }

        public void setAccount_set(List<DescribeS2AccountsResponse.QingCloudS2Accounts> account_set) {
            this.account_set = account_set;
        }

        public List<DescribeS2AccountsResponse.QingCloudS2Accounts> getS2_accounts() {
            return s2_accounts;
        }

        public void setS2_accounts(List<DescribeS2AccountsResponse.QingCloudS2Accounts> s2_accounts) {
            this.s2_accounts = s2_accounts;
        }
    }
}
