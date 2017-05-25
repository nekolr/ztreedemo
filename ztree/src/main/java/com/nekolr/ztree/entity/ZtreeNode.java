package com.nekolr.ztree.entity;

import java.util.List;

/**
 * @author nekolr
 * @version 1.0
 * @description ztree节点类
 */
public class ZtreeNode {
    private Long deptid;
    private String deptname;
    private Integer layer;
    private Long parentid;
    private String layorder;

    private Boolean isParent;

    private List<ZtreeNode> children;

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getLayer() {
        return layer;
    }

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getLayorder() {
        return layorder;
    }

    public void setLayorder(String layorder) {
        this.layorder = layorder;
    }

    public List<ZtreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<ZtreeNode> children) {
        this.children = children;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }
}
