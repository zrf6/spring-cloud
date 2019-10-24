package com.wn.service.imp;

import com.wn.entity.User;
public interface UserService{


    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByToken(String token);
}
