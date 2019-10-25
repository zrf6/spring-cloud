package com.wn.controller;


import com.wn.entity.com.wn.entity.Permission;
import com.wn.entity.com.wn.utils.Result;
import com.wn.mapper.UserMapper;
import com.wn.service.PermissionService;
import com.wn.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
//@RequestMapping("user")
public class UserController {

    @Resource
    PermissionService permissionService;
    @Resource
    UserService userService;

//    @GetMapping("/{id}")
    @GetMapping("getUser")
    public Result selectByPrimaryKey(@PathVariable Integer id){
        Permission obj = permissionService.selectByPrimaryKey(id);
        return new Result("success", null, null, obj);
    }

    @PostMapping("login")
    public Result login(HttpSession session, HttpServletRequest req){
        Cookie[] cookies = req.getCookies();
        String sessionId = null;
        if(cookies != null || cookies.length != 0){
            for(Cookie c : cookies){
                if(c.getName().equals("SESSION")){
                    sessionId = c.getValue();
                }
            }
        }
        System.out.println("user模块中的session为" + session.getId());
        System.out.println(session.getAttribute("用户"));
        return new Result("success", "1", null, permissionService.selectByPrimaryKey(1));
    }

}
