package com.profITsoft.internship.filter;

import com.profITsoft.internship.entity.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/login")
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        User user =(User) httpServletRequest.getSession().getAttribute("user");
        if(user!=null){
            httpServletResponse.sendRedirect("/user");
            return;
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
