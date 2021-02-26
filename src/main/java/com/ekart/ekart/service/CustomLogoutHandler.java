//package com.ekart.ekart.service;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserCache;
//import org.springframework.security.web.authentication.logout.LogoutHandler;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Service
//public class CustomLogoutHandler implements LogoutHandler {
//    private final UserCache userCache;
//    public CustomLogoutHandler(UserCache userCache) {
//        this.userCache = userCache;
//    }
//
//    @Override
//    public void logout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) {
//        String userName = authentication.getName();
//        userCache.removeUserFromCache(userName);
//    }
//
//
//}
