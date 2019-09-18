package com.lf;

import org.springframework.stereotype.Component;

@Component(value = "adminService")
public class AdminService {

    void add(){
        System.out.println("添加");
    }
    void jian(){
        System.out.println("减少");
    }
}
