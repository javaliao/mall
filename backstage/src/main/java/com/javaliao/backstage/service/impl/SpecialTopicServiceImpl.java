package com.javaliao.backstage.service.impl;

import cn.hutool.core.util.StrUtil;
import com.javaliao.backstage.bean.TbSpecialTopic;
import com.javaliao.backstage.mapper.SpecialTopicMapper;
import com.javaliao.backstage.service.SpecialTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

@Service
public class SpecialTopicServiceImpl implements SpecialTopicService {

    @Autowired
    private SpecialTopicMapper specialTopicMapper;

    @Override
    public void getSpecialTopicList(ModelMap modelMap) {
        List<TbSpecialTopic> specialTopics = specialTopicMapper.selectAll();
        modelMap.put("specialTopics",specialTopics);
    }

    @Override
    public void SpecialTopicSerach(TbSpecialTopic specialTopic, ModelMap modelMap) {
        specialTopic.setIsDelete(0L);
        if(StrUtil.isBlank(specialTopic.getSpecialTopicName())){
            specialTopic.setSpecialTopicName(null);
        }
        List<TbSpecialTopic> specialTopics = specialTopicMapper.select(specialTopic);
        modelMap.put("specialTopics",specialTopics);
    }

    @Override
    public void getSpecialTopicById(String specialTopicId, ModelMap modelMap) {
        TbSpecialTopic specialTopic = specialTopicMapper.selectByPrimaryKey(specialTopicId);
        modelMap.put("specialTopic",specialTopic);

    }

    @Override
    public void insertSpecialTopic(TbSpecialTopic specialTopic) throws Exception{
        specialTopic.setIsDelete(0L);
        specialTopic.setCreateTime(new Date());
        specialTopic.setUpdateTime(specialTopic.getCreateTime());
        int flag = specialTopicMapper.insertSelective(specialTopic);
        if(flag < 0){
            throw new Exception("添加失败");
        }
    }

    @Override
    public void updateSpecialTopic(TbSpecialTopic specialTopic) throws Exception{
        specialTopic.setUpdateTime(new Date());
        int flag = specialTopicMapper.updateByPrimaryKeySelective(specialTopic);
        if(flag < 0){
            throw new Exception("更新失败");
        }
    }

    @Override
    public void removeSpecialTopic(String specialTopicId) throws Exception{
        TbSpecialTopic tbSpecialTopic = specialTopicMapper.selectByPrimaryKey(specialTopicId);
        tbSpecialTopic.setIsDelete(1L);
        tbSpecialTopic.setUpdateTime(new Date());
        int flag = specialTopicMapper.updateByPrimaryKeySelective(tbSpecialTopic);
        if(flag < 0){
            throw new Exception("删除失败");
        }
    }
}
