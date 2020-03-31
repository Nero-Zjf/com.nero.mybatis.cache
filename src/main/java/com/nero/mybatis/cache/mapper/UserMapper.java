package com.nero.mybatis.cache.mapper;

import com.nero.mybatis.cache.po.UserPO;
import com.nero.mybatis.cache.pojo.UserParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<UserPO> getUserList(@Param("name") String name);

    int updUser(UserPO userPO);
}
