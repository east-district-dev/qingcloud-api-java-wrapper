package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.ResponseBase;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudVolume;

import java.util.List;

public class DescribeS2SharedTargetsResponse extends ResponseBase {
    private List<QingCloudS2SharedTarget> shared_target_set;

    @Override
    public List getSubClassPro(){
        return shared_target_set;
    }

    public void setShared_target_set(List<QingCloudS2SharedTarget> shared_target_set) {
        this.shared_target_set = shared_target_set;
    }

    public List<QingCloudS2SharedTarget> getShared_target_set() {
        return this.shared_target_set;
    }

    public class QingCloudS2SharedTarget{
        private String s2_shared_target_id;
        private String s2_server_id;
        private String export_name;
        private String description;
        private String target_types;
        private DescribeS2GroupsResponse.QingCloudS2Groups s2_group;
        private List<QingCloudVolume> volumes;
        private String create_time;
        private String status_time;

        public String getS2_shared_target_id() {
            return s2_shared_target_id;
        }

        public void setS2_shared_target_id(String s2_shared_target_id) {
            this.s2_shared_target_id = s2_shared_target_id;
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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTarget_types() {
            return target_types;
        }

        public void setTarget_types(String target_types) {
            this.target_types = target_types;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getStatus_time() {
            return status_time;
        }

        public void setStatus_time(String status_time) {
            this.status_time = status_time;
        }

        public DescribeS2GroupsResponse.QingCloudS2Groups getS2_group() {
            return s2_group;
        }

        public void setS2_group(DescribeS2GroupsResponse.QingCloudS2Groups s2_group) {
            this.s2_group = s2_group;
        }

        public List<QingCloudVolume> getVolumes() {
            return volumes;
        }

        public void setVolumes(List<QingCloudVolume> volumes) {
            this.volumes = volumes;
        }
    }
}
