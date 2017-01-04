package com.model.common;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: LBfile
 * Date: 17-1-3
 * Time: 下午7:39
 * To change this template use File | Settings | File Templates.
 */
public class Basics implements Serializable {

    private String id;
    private String createPersonId;
    private String createTime;
    private String modifiedPersonId;
    private String modifiedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(String createPersonId) {
        this.createPersonId = createPersonId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifiedPersonId() {
        return modifiedPersonId;
    }

    public void setModifiedPersonId(String modifiedPersonId) {
        this.modifiedPersonId = modifiedPersonId;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
