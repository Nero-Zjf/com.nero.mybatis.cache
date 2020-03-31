package com.nero.mybatis.cache;

import com.nero.mybatis.cache.mapper.UserMapper;
import com.nero.mybatis.cache.po.UserPO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        try {
            //-------------------------使用 XML 构建 SqlSessionFactory-------------------------
            // 读取配置文件 mybatis-config.xml
            InputStream config = Resources
                    .getResourceAsStream("mybatis-config.xml");
            // 根据配置文件构建SqlSessionFactory
            SqlSessionFactory ssf = new SqlSessionFactoryBuilder()
                    .build(config);
            //--------------------------------------------------------

            // 通过 SqlSessionFactory 创建 SqlSession
            SqlSession ss = ssf.openSession();

            //获取Mapper
            UserMapper userMapper = ss.getMapper(UserMapper.class);

            // 查询用户
            System.out.println("--------------查询用户1--------------------------------");
            List<UserPO> userPOList1 = userMapper.getUserList("tom");
            System.out.println(userPOList1);

            //更新用户
//            userMapper.updUser(userPOList1.get(0));

            System.out.println("--------------查询用户2--------------------------------");
            List<UserPO> userPOList2 = userMapper.getUserList("tom");
            System.out.println(userPOList2);

            // 提交事务
            ss.commit();
            // 关闭 SqlSession
            ss.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
