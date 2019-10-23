package com.wn.controller;


import com.wn.entity.Permission;
import com.wn.service.imp.PermissionService;
import com.wn.utlis.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    PermissionService permissionService;

    @GetMapping("/{id}")
    public Result selectByPrimaryKey(@PathVariable Integer id){
        Permission obj = permissionService.selectByPrimaryKey(id);
        return new Result("success",null,null, obj);
    }

}
