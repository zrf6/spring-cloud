package com.wn.controller;


import com.wn.entity.Permission;
import com.wn.service.imp.PermissionService;
import com.wn.utlis.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
//@RequestMapping("user")
public class UserController {

    @Resource
    PermissionService permissionService;

//    @GetMapping("/{id}")
    @GetMapping("getUser")
    public Result selectByPrimaryKey(@PathVariable Integer id){
        Permission obj = permissionService.selectByPrimaryKey(id);
        return new Result("success",null,null, obj);
    }

    @GetMapping("login")
    public Result login(HttpSession session){
        System.out.println("user模块中的session为" + session.getId());
        System.out.println(session.getAttribute("用户"));
        return null;
    }

}
