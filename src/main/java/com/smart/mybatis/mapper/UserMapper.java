package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Ram
 * @Since: 2020.10.26 11:44
 */
public interface UserMapper {
    /**
     * 插入数据库
     * @param user 用户
     * @return 影响行数
     */
    int insert(@Param("user")User user);

    /**
     * 根据用户id查询用户
     * @param uid 用户id
     * @return 用户
     */
    User selectById(@Param("uid")Integer uid);

    /**
     * 修改用户信息
     * @param user 要修改的数据
     * @return 影响行数
     */
    int update(@Param("user") User user);
}
