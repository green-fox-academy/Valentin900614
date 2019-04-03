package com.greenfox.springsecurity2.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(path = "/")
    public String Hello() {
        return "Hello World";
    }

    @RequestMapping(path = "/notprotected")
    public String HelloAgain() {
        return "Hello from a non-protected page";
    }

    @RequestMapping(path = "/protectedByUserRole")
    public String HelloUser() {
        return "Hello User Role";
    }

    @RequestMapping(path = "/protectedByAdminRole")
    public String HelloAdmin() {
        return "Hello Admin Role";
    }


}
