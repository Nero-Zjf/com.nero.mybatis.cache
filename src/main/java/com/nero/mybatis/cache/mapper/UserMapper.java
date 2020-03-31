package com.nero.mybatis.cache.mapper;

import com.nero.mybatis.cache.po.UserPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<UserPO> getUserList(@Param("name") String name);

    int updUser(UserPO userPO);
}
