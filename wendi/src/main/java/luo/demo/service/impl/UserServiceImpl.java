package luo.demo.service.impl;

import luo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import luo.demo.pojo.*;
import luo.demo.dao.*;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(users users) {
        userMapper.insertUser(users);
    }

    @Override
    public users loginUser(String username, String password) {
        return userMapper.checkUser(username,password).size() ==0 ? null:userMapper.checkUser(username,password).get(0);
    }

    @Override
    public List<users> getallUsers() {
        return userMapper.getallUser();
    }

    @Override
    public void updateUser(users users) {
        userMapper.updateUser(users);
    }


}
