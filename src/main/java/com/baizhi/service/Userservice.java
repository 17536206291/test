package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface Userservice {
    public List<User>  lookall();
    public User lookId(Integer id);
    public void  delete(Integer[] ids);
}
