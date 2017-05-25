package com.nekolr.ztree.dao;

import com.nekolr.ztree.db.MysqlDB;
import com.nekolr.ztree.entity.ZtreeNode;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository(value = "ztreeDao")
public class ZtreeDaoImpl implements ZtreeDao{

    public List<ZtreeNode> getAll(){
        String sql = "SELECT * FROM department ORDER BY layorder";
        List<ZtreeNode> list = MysqlDB.queryList(sql,ZtreeNode.class,null);
        return list;
    }

    public List<ZtreeNode> getAllParent() {
        String sql = "SELECT * FROM department WHERE parentid = 0";
        List<ZtreeNode> list = MysqlDB.queryList(sql,ZtreeNode.class,null);
        return list;
    }

    public List<ZtreeNode> getALLChild(Long deptid) {
        String sql = "SELECT * FROM department WHERE parentid = ?";
        List<ZtreeNode> list = MysqlDB.queryList(sql,ZtreeNode.class,new Object[]{deptid});
        return list;
    }
}
