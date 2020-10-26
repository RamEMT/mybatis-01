package com.smart.mybatis.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Ram
 */
public class Product {
    /**
     * 主键
     */
    private Integer productId;

    /**
     * 产品名称
     */
    private String title;

    /**
     * 详细信息
     */
    private String content;

    /**
     * 产品图片
     */
    private String img;

    /**
     * 产品价格
     */
    private BigDecimal price;

    /**
     *
     */
    private Integer cateId;

    /**
     * 创建时间
     */
    private Date cateDate;

    /**
     * 状态码 0表示未删除 1表示删除
     */
    private Integer status;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
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
}

