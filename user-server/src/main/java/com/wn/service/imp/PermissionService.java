package com.wn.service.imp;

import com.wn.entity.Permission;
public interface PermissionService{


    int deleteByPrimaryKey(Integer pid);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

}
