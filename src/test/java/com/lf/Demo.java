package com.lf;

import com.lf.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {
@Resource(name="adminService")
private AdminService adminService;

    @Test
    public void demo(){
        adminService.add();
        adminService.jian();

    }
}
