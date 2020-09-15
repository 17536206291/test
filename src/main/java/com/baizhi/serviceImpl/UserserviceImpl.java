package com.baizhi.serviceImpl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserserviceImpl implements Userservice {
    @Resource
    private UserDao userDao;
    @Override
    public List<User> lookall() {
        List<User> users = userDao.selectAll();
        return users;
    }

    @Override
    public User lookId(Integer id) {
        User user = userDao.selectId(id);
        return user;
    }

    @Override
    public void delete(Integer[] ids) {
        userDao.delete(ids);
    }
}
