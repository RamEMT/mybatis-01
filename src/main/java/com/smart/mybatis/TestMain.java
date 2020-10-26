package com.smart.mybatis;

import com.smart.mybatis.entity.User;
import com.smart.mybatis.mapper.TestSelectMapper;
import com.smart.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.26 15:20
 */
public class TestMain {

    public static void main(String[] args) {
        //工厂模式
        //构建者模式
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
                TestMain.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        //在原生 mybatis 中默认为 false
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        int insert = userMapper.insert(user);
        System.out.println(insert);

        TestSelectMapper selectMapper = sqlSession.getMapper(TestSelectMapper.class);
        User user1 = selectMapper.selectById(1);
        System.out.println(user1);
        List<User> users = selectMapper.selectList(0, 10);
        users.forEach(System.out::println);
    }
}
