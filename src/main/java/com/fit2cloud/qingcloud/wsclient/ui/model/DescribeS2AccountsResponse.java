package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.ResponseBase;

import java.util.List;

public class DescribeS2AccountsResponse extends ResponseBase {
    private List<QingCloudS2Accounts> s2_account_set;

    public List<QingCloudS2Accounts> getS2_account_set() {
        return s2_account_set;
    }

    public void setS2_account_set(List<QingCloudS2Accounts> s2_account_set) {
        this.s2_account_set = s2_account_set;
    }

    @Override
    public List getSubClassPro(){
        return s2_account_set;
    }

    public class QingCloudS2Accounts{
        private String opt_parameters;
        private String account_type;
        private String account_id;
        private String description;
        private String account_name;
        private String nfs_ipaddr;
        private String smb_name;
        private String create_time;
        private String rw_flag;

        public String getOpt_parameters() {
            return opt_parameters;
        }

        public void setOpt_parameters(String opt_parameters) {
            this.opt_parameters = opt_parameters;
        }

        public String getAccount_type() {
            return account_type;
        }

        public void setAccount_type(String account_type) {
            this.account_type = account_type;
        }

        public String getAccount_id() {
            return account_id;
        }

        public void setAccount_id(String account_id) {
            this.account_id = account_id;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAccount_name() {
            return account_name;
        }

        public void setAccount_name(String account_name) {
            this.account_name = account_name;
        }

        public String getNfs_ipaddr() {
            return nfs_ipaddr;
        }

        public void setNfs_ipaddr(String nfs_ipaddr) {
            this.nfs_ipaddr = nfs_ipaddr;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getRw_flag() {
            return rw_flag;
        }

        public void setRw_flag(String rw_flag) {
            this.rw_flag = rw_flag;
        }

        public String getSmb_name() {
            return smb_name;
        }

        public void setSmb_name(String smb_name) {
            this.smb_name = smb_name;
        }
    }
}
