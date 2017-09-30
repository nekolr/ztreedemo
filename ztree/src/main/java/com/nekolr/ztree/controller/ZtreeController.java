package com.nekolr.ztree.controller;

import com.nekolr.simvc.annotation.Controller;
import com.nekolr.simvc.annotation.RequestMapping;
import com.nekolr.simvc.annotation.RequestMethod;
import com.nekolr.simvc.annotation.ResponseBody;
import com.nekolr.ztree.entity.ZtreeNode;
import com.nekolr.ztree.service.ZtreeService;
import com.nekolr.ztree.utils.AppUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@Controller
@RequestMapping(value = "/ztree")
public class ZtreeController {
    private ZtreeService ztreeService = (ZtreeService) AppUtil.getBean("ztreeService");

    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/getData.do", method = RequestMethod.GET)
    @ResponseBody
    public List<ZtreeNode> getData(HttpServletRequest request, HttpServletResponse response, String param){
        List<ZtreeNode> list = ztreeService.getAll();
        if(!Objects.isNull(list)) {
            for(Iterator<ZtreeNode> iterator = list.iterator();iterator.hasNext();){
                ZtreeNode node = iterator.next();
                if(node.getParentid().equals(0L)){
                    node.setParent(true);
                }else{
                    node.setParent(false);
                }
            }
        }

        return list;
    }
}
