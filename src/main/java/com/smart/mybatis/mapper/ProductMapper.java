package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.26 20:55
 */
public interface ProductMapper {
    /**
     * 查询指定分类id的所有产品
     * @param cateId 分类id
     * @return 对应id的所有产品
     */
    List<Product> selectListByCateId(@Param("cateId") int cateId);

    /**
     * 添加产品
     * @param product 产品
     * @return 影响行数
     */
    int insert(@Param("product") Product product);
}
