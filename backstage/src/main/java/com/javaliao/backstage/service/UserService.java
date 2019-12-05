package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbUser;
import org.springframework.ui.ModelMap;

public interface UserService {

    void getUserList(ModelMap modelMap);

    void userSearch(TbUser tbUser, ModelMap modelMap);

    void getUserById(String userId, ModelMap modelMap);

    void removeUserById(String userId) throws Exception;

    void updateUser(TbUser tbUser) throws Exception;

    void insertUser(TbUser tbUser) throws Exception;
}
