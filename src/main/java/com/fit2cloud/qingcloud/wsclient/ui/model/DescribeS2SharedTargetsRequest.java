package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

import java.util.List;


public class DescribeS2SharedTargetsRequest extends RequestBase {
    private List<String> shared_targets;//共享存储目标ID
    private List<String> target_types;//共享存储目标类型
    private String s2_server_id;//共享存储服务器ID
    private String export_name;//共享存储目标名称，或IQN

    public List<String> getShared_targets() {
        return shared_targets;
    }

    public void setShared_targets(List<String> shared_targets) {
        this.shared_targets = shared_targets;
    }

    public List<String> getTarget_types() {
        return target_types;
    }

    public void setTarget_types(List<String> target_types) {
        this.target_types = target_types;
    }

    public String getS2_server_id() {
        return s2_server_id;
    }

    public void setS2_server_id(String s2_server_id) {
        this.s2_server_id = s2_server_id;
    }

    public String getExport_name() {
        return export_name;
    }

    public void setExport_name(String export_name) {
        this.export_name = export_name;
    }
}
