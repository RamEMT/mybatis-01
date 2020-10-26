package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Ram
 * @Since: 2020.10.26 19:29
 */
public interface TestInsertMapper {
    /**
     * 插入用户数据
     * @param user 用户
     * @return 影响行数
     */
    int insert(@Param("user") User user);
}
