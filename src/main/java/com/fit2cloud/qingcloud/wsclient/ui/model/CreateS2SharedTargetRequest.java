package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

import java.util.List;

public class CreateS2SharedTargetRequest extends RequestBase {
    private String s2_server;//	String	共享存储服务器ID	Yes
    private String s2_server_id;
    private String export_name;//	String	共享存储目标名称，或IQN
    private String target_type;//	String	共享存储目标类型，类型：ISCSI（vsan），NFS 和 SMB（vnas）	Yes
    private String description;//	String	共享存储目标描述	No
    private List<String> volumes;//.n	String	添加硬盘作为backstore	No
    private List<String> initiator_names;//.n	String	指定客户端IQN
    private String s2_group;//	String	访问共享目录的权限组ID

    public String getS2_server() {
        return s2_server;
    }

    public void setS2_server(String s2_server) {
        this.s2_server = s2_server;
    }

    public String getExport_name() {
        return export_name;
    }

    public void setExport_name(String export_name) {
        this.export_name = export_name;
    }

    public String getTarget_type() {
        return target_type;
    }

    public void setTarget_type(String target_type) {
        this.target_type = target_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<String> volumes) {
        this.volumes = volumes;
    }

    public List<String> getInitiator_names() {
        return initiator_names;
    }

    public void setInitiator_names(List<String> initiator_names) {
        this.initiator_names = initiator_names;
    }

    public String getS2_group() {
        return s2_group;
    }

    public void setS2_group(String s2_group) {
        this.s2_group = s2_group;
    }

    public String getS2_server_id() {
        return s2_server_id;
    }

    public void setS2_server_id(String s2_server_id) {
        this.s2_server_id = s2_server_id;
    }
}

