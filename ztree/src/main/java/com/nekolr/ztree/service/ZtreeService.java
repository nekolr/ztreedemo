package com.nekolr.ztree.service;

import com.nekolr.ztree.entity.ZtreeNode;

import java.util.List;

/**
 *
 */
public interface ZtreeService {

    public List<ZtreeNode> getAll();

    public List<ZtreeNode> getAllParent();

    public List<ZtreeNode> getALLChild(Long deptid);
}
