package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.26 20:55
 */
public interface CateMapper {
    /**
     * 查询所有
     * @return 数据集合
     */
    List<Cate> selectList();

    /**
     * 插入数据
     * @param cate 对象
     * @return 影响行数
     */
    int insert(@Param("cate") Cate cate);

}
