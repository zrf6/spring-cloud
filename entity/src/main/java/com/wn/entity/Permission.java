package com.wn.entity;

import java.io.Serializable;

public class Permission implements Serializable {
    private Integer pid;

    private String name;

    private String resource;

    private Integer parentId;

    private Integer level;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", resource=").append(resource);
        sb.append(", parentId=").append(parentId);
        sb.append(", level=").append(level);
        sb.append("]");
        return sb.toString();
    }
}