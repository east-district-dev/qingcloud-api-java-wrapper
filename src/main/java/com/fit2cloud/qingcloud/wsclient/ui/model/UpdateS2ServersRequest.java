package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

import java.util.List;

public class UpdateS2ServersRequest extends RequestBase {
    private List<String> s2_servers;

    public List<String> getS2_servers() {
        return s2_servers;
    }

    public void setS2_servers(List<String> s2_servers) {
        this.s2_servers = s2_servers;
    }
}
