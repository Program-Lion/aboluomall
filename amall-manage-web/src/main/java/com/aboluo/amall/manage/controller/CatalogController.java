package com.aboluo.amall.manage.controller;


import com.aboluo.amall.api.bean.PmsBaseCatalog1;
import com.aboluo.amall.api.bean.PmsBaseCatalog2;
import com.aboluo.amall.api.bean.PmsBaseCatalog3;
import com.aboluo.amall.api.service.CatalogService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//跨域
@CrossOrigin
public class CatalogController {

    @Reference
    CatalogService catalogService;

    //返回一级商品数据
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        return catalogService.getCatalog1();
    }

    //返回二级商品数据
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        return catalogService.getCatalog2(catalog1Id);
    }

    //返回三级商品数据
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        return catalogService.getCatalog3(catalog2Id);
    }
}
