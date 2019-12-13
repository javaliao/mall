package com.javaliao.backstage.service.impl;

import com.javaliao.backstage.bean.TbUser;
import com.javaliao.backstage.mapper.UserMapper;
import com.javaliao.backstage.service.UserService;
import com.javaliao.backstage.util.StringTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class UseServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void getUserList(ModelMap modelMap) {
        TbUser tbUser = new TbUser();
        tbUser.setIsDelete(0L);
        List<TbUser> select = userMapper.select(tbUser);
        modelMap.addAttribute("tbUsers",select);

    }

    @Override
    public void userSearch(TbUser tbUser, ModelMap modelMap) {
        if(StringTool.isEmpty(tbUser.getUserName())){
            tbUser.setUserName(null);
        }
        if(StringTool.isEmpty(tbUser.getUserPhone())){
            tbUser.setUserPhone(null);
        }
        if(StringTool.isEmpty(tbUser.getUserRealName())){
            tbUser.setUserRealName(null);
        }
        tbUser.setIsDelete(0L);
        List<TbUser> select = userMapper.select(tbUser);
        modelMap.addAttribute("tbUsers",select);
    }

    @Override
    public void getUserById(String userId, ModelMap modelMap) {
        TbUser tbUser = new TbUser();
        tbUser.setIsDelete(0L);
        TbUser select = userMapper.selectOne(tbUser);
        modelMap.addAttribute("tbUser",select);
    }

    @Override
    public void removeUserById(String userId) throws Exception {
        TbUser tbUser = new TbUser();
        tbUser.setId(Long.valueOf(userId));
        int i = userMapper.deleteByPrimaryKey(tbUser);
        if(i <= 0){
            throw new Exception("删除失败！");
        }
    }

    @Override
    public void updateUser(TbUser tbUser) throws Exception {
        int i = userMapper.updateByPrimaryKey(tbUser);
        if(i <= 0){
            throw new Exception("更新失败！");
        }
    }

    @Override
    public void insertUser(TbUser tbUser) throws Exception {
        tbUser.setIsDelete(0L);
        int insert = userMapper.insert(tbUser);
        if(insert <= 0){
            throw new Exception("添加失败！");
        }
    }


}
