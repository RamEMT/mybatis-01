package com.smart.mybatis.mapper;

import com.smart.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.26 19:01
 */
public interface TestSelectMapper {
    /**
     * 根据id查询用户信息
     * @param id id
     * @return 用户
     */
    User selectById(@Param("id") int id);

    List<User> selectList(@Param("page") int page,@Param("size") int size);
}
