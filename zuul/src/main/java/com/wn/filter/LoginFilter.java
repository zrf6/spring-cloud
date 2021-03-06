package com.wn.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.wn.entity.com.wn.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Base64;
import java.util.UUID;

public class LoginFilter extends ZuulFilter {

    /**
     *  定义过滤器的类型，pre为前置过滤器
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        //获取容器
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest req = ctx.getRequest();
        HttpSession session = req.getSession();
        session.setAttribute("用户", new User(1,"张三", UUID.randomUUID().toString()));
        System.out.println(session.getAttribute("用户"));
        System.out.println("网关中的session为" + session.getId());
        //将Cookie加密后添加到头信息，第一次请求Session也能共享
        ctx.addZuulRequestHeader("Cookie","SESSION="+ Base64.getEncoder().encodeToString(session.getId().getBytes()));
//        Cookie[] cookies = req.getCookies();
//        //未登录过，进行登录
//        if(cookies == null || cookies.length == 0){
//
//        } else {
//            for(Cookie c : cookies){
//                if(c.getName() != null && c.getName().equals("Token")){
//
//                }
//            }
//        }
        //停止向下路由
//        ctx.setSendZuulResponse(false);
        //设置响应的错误编码
//        ctx.setResponseStatusCode(401);
        //设置响应的错误信息
//        ctx.setResponseBody("miss token");
        return null;
    }
}
