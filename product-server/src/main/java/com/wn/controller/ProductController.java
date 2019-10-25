package com.wn.controller;

import com.wn.entity.Product;
import com.wn.service.ProductService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Resource
    ProductService productService;
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/{id}")
    public String selectByPrimaryKey(@PathVariable Integer id, HttpSession httpSession, HttpServletRequest req) throws Exception {
        Cookie[] httpCookies = req.getCookies();
        //创建Http头信息对象
        HttpHeaders headers = new HttpHeaders();
        //创建集合保存cookie信息
        List<String> cookies =new ArrayList<String>();
        //定义变量保存session的键
        String sessionKey = null;
        if(httpCookies.length != 0){
            for(Cookie c : httpCookies){
                if(c.getName().equals("SESSION")){
                    sessionKey = c.getValue();
                    break;
                }
            }
        }
        //将session键保存到cookie中
        cookies.add("SESSION=" + sessionKey + ";Path=/; HttpOnly");
        //将cookie存入头部
        headers.put(HttpHeaders.COOKIE,cookies);
        System.out.println("商品模块获取的sessionId为：" + httpSession.getId());
        System.out.println("cookie为" + sessionKey);
        Product product = productService.selectByPrimaryKey(id);
//        //请求的参数
//        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
//        map.add("product", new Result());
        //封装参数和cookie
//       HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(null, headers);
        //发送请求
        ResponseEntity<String> response = restTemplate.postForEntity("http://user-service/login", request, String.class);
        String json = new String(response.getBody().getBytes("ISO8859-1"),"utf-8");
        return json;
    }

}
