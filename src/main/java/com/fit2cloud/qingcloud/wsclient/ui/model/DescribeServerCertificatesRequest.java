package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;


public class DescribeServerCertificatesRequest extends Request {
    private List<String> server_certificates;
    private String search_word;
    private Integer verbose;
    private Integer offset;
    private Integer limit;

    private String zone;

    public List<String> getServer_certificates() {
        return server_certificates;
    }

    public void setServer_certificates(List<String> server_certificates) {
        this.server_certificates = server_certificates;
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
}
