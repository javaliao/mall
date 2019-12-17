package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbSpecialTopic;
import org.springframework.ui.ModelMap;

public interface SpecialTopicService {
    void getSpecialTopicList(ModelMap modelMap);

    void SpecialTopicSerach(TbSpecialTopic specialTopic, ModelMap modelMap);

    void getSpecialTopicById(String specialTopicId, ModelMap modelMap);

    void insertSpecialTopic(TbSpecialTopic specialTopic) throws Exception;

    void updateSpecialTopic(TbSpecialTopic specialTopic)  throws Exception;

    void removeSpecialTopic(String specialTopicId) throws Exception;
}
