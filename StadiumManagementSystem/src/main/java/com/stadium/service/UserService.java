package com.stadium.service;

import javax.servlet.http.HttpSession;

public interface UserService {
    boolean user(String username, String password, HttpSession session);
    boolean register(String username, String password, String telephone, String identity);
}
