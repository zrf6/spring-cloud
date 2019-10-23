package com.wn.service;

import com.wn.entity.Permission;
import com.wn.mapper.PermissionMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.wn.service.imp.PermissionService;
@Service
public class PermissionServiceImpl implements PermissionService{

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public int deleteByPrimaryKey(Integer pid) {
        return permissionMapper.deleteByPrimaryKey(pid);
    }

    @Override
    public int insert(Permission record) {
        return permissionMapper.insert(record);
    }

    @Override
    public int insertSelective(Permission record) {
        return permissionMapper.insertSelective(record);
    }

    @Override
    public Permission selectByPrimaryKey(Integer pid) {
        return permissionMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int updateByPrimaryKeySelective(Permission record) {
        return permissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return permissionMapper.updateByPrimaryKey(record);
    }

}
