package cn.ssm.dao;

import cn.ssm.po.User;

public interface UserDao {
    //根据id查询用户信息
    public User findUserById(int id) throws Exception;

}
