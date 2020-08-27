package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.Date;

public class QingCloudProject {
	private String project_id;
	private String project_name;
	private String status;
    private String resource_group_id;
    private String description;
    private String owner_name;
    private String owner;
    private Integer enabled;
    private String console_id;
    private String root_user_id;
    private Date create_time;


	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResource_group_id() {
		return resource_group_id;
	}

	public void setResource_group_id(String resource_group_id) {
		this.resource_group_id = resource_group_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getConsole_id() {
		return console_id;
	}

	public void setConsole_id(String console_id) {
		this.console_id = console_id;
	}

	public String getRoot_user_id() {
		return root_user_id;
	}

	public void setRoot_user_id(String root_user_id) {
		this.root_user_id = root_user_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
}
