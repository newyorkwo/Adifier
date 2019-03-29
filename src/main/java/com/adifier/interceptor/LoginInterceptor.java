package com.adifier.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: create interceptor for login
 * @author: StevenWu
 * @create: 2019-03-29 18:09
 **/

public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("user")== null){
            response.sendRedirect("login");
            return false;
        }
        return true;
    }
}