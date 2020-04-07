package com.gyl.gmall.service;

import com.gyl.gmall.bean.BaseAttrInfo;
import com.gyl.gmall.bean.BaseCatalog1;
import com.gyl.gmall.bean.BaseCatalog2;
import com.gyl.gmall.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {

    /**
     * 获取一级分类
     * @return
     */
    List<BaseCatalog1> getCatalog1();

    /**
     * 根据一级分类ID获取二级分类
     * @param catalog1Id
     * @return
     */
    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    /**
     * 根据二级分类ID取三级分类
     * @param catalog2Id
     * @return
     */
    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    /**
     * 根据三级分类ID获取平台属性
     * @param catalog3Id
     * @return
     */
    public List<BaseAttrInfo> getAttrList(String catalog3Id);
}

