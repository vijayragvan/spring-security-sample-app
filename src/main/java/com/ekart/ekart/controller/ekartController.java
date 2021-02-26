package com.ekart.ekart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ekartController {
    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String goToLoginPage(){
        return "login1";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/user")
    public String user(){
        return "user";
    }

    @RequestMapping(method = RequestMethod.GET,value = "/admin")
    public String admin(){
        return "admin";
    }

}
