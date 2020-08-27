package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudProject;
import com.google.gson.Gson;

import java.util.List;

public class DescribeProjectsResponse {
    private String action;
    private List<QingCloudProject> project_set;
    private Integer total_count;
    private Integer ret_code;

    public static DescribeProjectsResponse fromJson(String jsonDescribeProjectsResponse){
        Gson gson = new Gson();
        DescribeProjectsResponse describeProjectsResponse = gson.fromJson(jsonDescribeProjectsResponse,DescribeProjectsResponse.class);
        return  describeProjectsResponse;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<QingCloudProject> getProject_set() {
        return project_set;
    }

    public void setProject_set(List<QingCloudProject> project_set) {
        this.project_set = project_set;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Integer getRet_code() {
        return ret_code;
    }

    public void setRet_code(Integer ret_code) {
        this.ret_code = ret_code;
    }
}
