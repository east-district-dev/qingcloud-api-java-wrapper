package com.fit2cloud.qingcloud.wsclient.base;

import java.util.List;
import com.fit2cloud.qingcloud.wsclient.ui.model.Request;

public class RequestBase extends Request {
    private String search_word;
    private Integer verbose;
    private Integer offset;
    private Integer limit;
    private String zone;

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
