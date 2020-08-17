package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.RequestBase;

import java.util.List;


public class DescribeS2ServersRequest extends RequestBase {
    private List<String> s2_servers;
    private List<String> service_types;
    private List<String> status;


	public List<String> getS2_servers() {
		return s2_servers;
	}

	public void setS2_servers(List<String> s2_servers) {
		this.s2_servers = s2_servers;
	}

	public List<String> getService_types() {
		return service_types;
	}

	public void setService_types(List<String> service_types) {
		this.service_types = service_types;
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}
}
