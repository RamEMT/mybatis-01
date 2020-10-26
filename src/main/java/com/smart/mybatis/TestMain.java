package com.smart.mybatis;

import com.smart.mybatis.entity.User;
import com.smart.mybatis.mapper.TestInsertMapper;
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
        User user1 = new User();
        user1.setUsername("admin");
        user1.setPassword("123456");
        int insert1 = userMapper.insert(user1);
        System.out.println(insert1);

        TestSelectMapper selectMapper = sqlSession.getMapper(TestSelectMapper.class);
        //查询并打印
        System.out.println(selectMapper.selectById(1));
        List<User> users = selectMapper.selectList(0, 10);
        users.forEach(System.out::println);

        TestInsertMapper insertMapper = sqlSession.getMapper(TestInsertMapper.class);
        User user2 = new User();
        user2.setUsername("zs");
        user2.setPassword("110120");
        int insert2 = insertMapper.insert(user2);
        if (insert2 > 0){
            System.out.println("添加成功");
            System.out.println(user2.getUid());
        }else {
            System.out.println("添加失败");
        }
    }
}
