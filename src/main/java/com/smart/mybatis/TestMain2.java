package com.smart.mybatis;

import com.smart.mybatis.entity.Cate;
import com.smart.mybatis.entity.Product;
import com.smart.mybatis.mapper.CateMapper;
import com.smart.mybatis.mapper.ProductMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Ram
 * @Since: 2020.10.26 21:33
 */
public class TestMain2 {
    public static void main(String[] args) {
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(
          TestMain2.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );

        SqlSession sqlSession = sessionFactory.openSession(true);
        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);

        //先保存主表的数据
        Cate cate = new Cate();
        cate.setName("华为手机");
        cateMapper.insert(cate);

        System.out.println(cate.getCateId());


        for (int i = 0; i < 2; i++) {
            Product product = new Product();
            product.setContent("110" + i);
            product.setCateId(cate.getCateId());
            product.setPrice(new BigDecimal("777.00"));
            product.setTitle("手机120" + i);
            product.setImg("/images/phone/" + i + ".gif");
            productMapper.insert(product);
        }

        //先查询主表的数据
        List<Cate> cates = cateMapper.selectList();
        cates.forEach(cate1 -> {
            List<Product> products = productMapper.selectListByCateId(cate1.getCateId());
            cate1.setProductList(products);
        });
        System.out.println(cates);
    }
}
