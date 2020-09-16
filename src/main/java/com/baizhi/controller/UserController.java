package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.Userservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/test")
@Controller
public class UserController {
    @Resource
    private Userservice userservice;

    @RequestMapping("/user")
    public String selectLook(Model model) {
        PageHelper.startPage(1,3);
        List<User> lookall = userservice.lookall();
        PageInfo pageInfo = new PageInfo<>(lookall);
        model.addAttribute("users",lookall);
        return "showAll";
    }

    @PostMapping("/userID")
    @ResponseBody
    public User selectLookID(User user) {
        User user1 = userservice.lookId(user.getId());
        return user1;

    }
    @GetMapping("/deleteIds")
    public  String  deleteIds(Integer[] ids){
        for (Integer id : ids) {
            System.out.println(id);
        }
        userservice.delete(ids);
        System.out.println("批量删除成功");
        System.out.println("我要吃饭了@@@@@@@@@@@@");
        System.out.println("wo jius yao sile 我死你，你妈妈妈妈妈妈们");
        System.out.println("小秘方就是我的加");
        return  "redirect:/test/user";


    }



}
