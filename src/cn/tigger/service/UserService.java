package cn.tigger.service;

import cn.tigger.pojo.User;

import java.io.Serializable;

/**
 * Created by bowen on 2017/1/4.
 */
public class UserService {

    private String username;

    /**
     * @return user
     */
    public User getUserById(){

        return new User();

    }
}
