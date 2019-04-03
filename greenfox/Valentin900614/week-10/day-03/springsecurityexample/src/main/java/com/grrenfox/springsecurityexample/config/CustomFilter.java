package com.grrenfox.springsecurityexample.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.security.Principal;

@Component
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Init::called");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy::called");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter::called");
        HttpServletRequest request1 = (HttpServletRequest) request;
        Principal userPrincipal = request1.getUserPrincipal();
        System.out.println("userPrinciple: " + userPrincipal);
    }
}
