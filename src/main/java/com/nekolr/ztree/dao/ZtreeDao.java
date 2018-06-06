package com.nekolr.ztree.dao;

import com.nekolr.ztree.entity.ZtreeNode;

import java.util.List;

/**
 *
 */
public interface ZtreeDao {

    public List<ZtreeNode> getAll();

    public List<ZtreeNode> getAllParent();

    public List<ZtreeNode> getALLChild(Long deptid);
}
