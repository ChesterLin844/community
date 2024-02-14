package com.chester.community.dao;

import com.chester.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectById(int id);
    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    User updateStatus(int id, int status);
}
