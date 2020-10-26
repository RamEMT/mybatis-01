package com.smart.mybatis.entity;

import java.util.Date;
import java.util.List;

/**
 * @author Ram
 */
public class Cate {
    /**
     * 主键
     */
    private Integer cateId;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date cateDate;

    /**
     * 状态码 0表示未删除 1表示删除
     */
    private Integer status;

    private List<Product> productList;


    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCateDate() {
        return cateDate;
    }

    public void setCateDate(Date cateDate) {
        this.cateDate = cateDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

