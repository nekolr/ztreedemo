package com.nekolr.ztree.service;

import com.nekolr.ztree.dao.ZtreeDao;
import com.nekolr.ztree.entity.ZtreeNode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service(value = "ztreeService")
public class ZtreeServiceImpl implements ZtreeService{
    @Resource
    private ZtreeDao ztreeDao;

    public List<ZtreeNode> getAll(){
        List<ZtreeNode> list = ztreeDao.getAll();
        return list;
    }

    public List<ZtreeNode> getAllParent() {
        List<ZtreeNode> list = ztreeDao.getAllParent();
        return list;
    }

    public List<ZtreeNode> getALLChild(Long deptid) {
        List<ZtreeNode> list = ztreeDao.getALLChild(deptid);
        return list;
    }
}
