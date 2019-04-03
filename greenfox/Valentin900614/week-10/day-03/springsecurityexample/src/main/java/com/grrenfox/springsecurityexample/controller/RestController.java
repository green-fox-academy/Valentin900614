package com.grrenfox.springsecurityexample.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/hello")
public class RestController {

    @GetMapping
    public String hello(@AuthenticationPrincipal final UserDetails userDetails) {
        String username = userDetails.getUsername();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        authorities.forEach(System.out::println);

        return "Hello World";
    }

}
