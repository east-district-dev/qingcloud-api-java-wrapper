package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DescribeVxnetsRequest extends Request {

	private List<String> vxnets;
	private Integer vxnet_type;//0:自管；1：受管；2：基础网络;
	private String search_word;
	private Integer verbose;
	private Integer offset;
	private Integer limit;
	private String zone;
	private boolean showVxnet0;//控制是否展示基础网络
//    private List<String> visibility;// public, private, shared

	public List<String> getVxnets() {
		return vxnets;
	}

	public void setVxnets(List<String> vxnets) {
		this.vxnets = vxnets;
	}

	public Integer getVxnet_type() {
		return vxnet_type;
	}

	public void setVxnet_type(Integer vxnet_type) {
		this.vxnet_type = vxnet_type;
	}

	public String getSearch_word() {
		return search_word;
	}

	public void setSearch_word(String search_word) {
		this.search_word = search_word;
	}

	public Integer getVerbose() {
		return verbose;
	}

	public void setVerbose(Integer verbose) {
		this.verbose = verbose;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public boolean isShowVxnet0() {
		return showVxnet0;
	}

	public void setShowVxnet0(boolean showVxnet0) {
		this.showVxnet0 = showVxnet0;
	}
}
