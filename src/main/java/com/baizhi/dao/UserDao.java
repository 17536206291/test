package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    //查询所有
    public List<User> selectAll ();
    //根据id查询
    public User selectId(Integer id);
    //批量删除
    public  void  delete(Integer[] ids);
}
