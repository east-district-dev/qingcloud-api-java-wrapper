package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

public class CreateS2AccountRequest extends RequestBase {
    private String account_type;//账号的类型，为NFS，SMB类型
    private String account_name;//	账号名称	No
    private String smb_name;//	SMB协议访问的用户名	No
    private String smb_passwd;//	SMB协议访问的密码	No
    private String nfs_ipaddr;//	NFS协议访问的IP地址	No

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getSmb_name() {
        return smb_name;
    }

    public void setSmb_name(String smb_name) {
        this.smb_name = smb_name;
    }

    public String getSmb_passwd() {
        return smb_passwd;
    }

    public void setSmb_passwd(String smb_passwd) {
        this.smb_passwd = smb_passwd;
    }

    public String getNfs_ipaddr() {
        return nfs_ipaddr;
    }

    public void setNfs_ipaddr(String nfs_ipaddr) {
        this.nfs_ipaddr = nfs_ipaddr;
    }
}
