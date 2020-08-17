package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.base.ResponseBase;
import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudS2Server;
import java.util.List;

public class DescribeS2ServersResponse extends ResponseBase {
	
	private List<QingCloudS2Server> s2_server_set;


	public List<QingCloudS2Server> getS2_server_set() {
		return s2_server_set;
	}

	public void setS2_server_set(List<QingCloudS2Server> s2_server_set) {
		this.s2_server_set = s2_server_set;
	}
}
