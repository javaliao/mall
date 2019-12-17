package com.javaliao.backstage.service.impl;

import cn.hutool.core.util.StrUtil;
import com.javaliao.backstage.bean.TbAdvertisement;
import com.javaliao.backstage.mapper.AdvertisementMapper;
import com.javaliao.backstage.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {
    @Autowired
    private AdvertisementMapper advertisementMapper;


    @Override
    public void getAdvertisementList(ModelMap modelMap) {
        List<TbAdvertisement> tbAdvertisements = advertisementMapper.selectAll();
        modelMap.put("tbAdvertisements", tbAdvertisements);
    }

    @Override
    public void advertisementSearch(TbAdvertisement tbAdvertisement, ModelMap modelMap) {
        tbAdvertisement.setIsDelete(0L);
        if (StrUtil.isBlank(tbAdvertisement.getAdvertisementName())) {
            tbAdvertisement.setAdvertisementName(null);
        }
        List<TbAdvertisement> tbAdvertisements = advertisementMapper.select(tbAdvertisement);
        modelMap.put("tbAdvertisements", tbAdvertisements);
    }

    @Override
    public void getAdvertisementById(String advertisementId, ModelMap modelMap) {
        TbAdvertisement tbAdvertisement = new TbAdvertisement();
        tbAdvertisement.setIsDelete(0L);
        tbAdvertisement.setId(Long.valueOf(advertisementId));
        TbAdvertisement advertisement = advertisementMapper.selectOne(tbAdvertisement);
        modelMap.put("tbAdvertisement", tbAdvertisement);

    }

    @Override
    public void insertAdvertisement(TbAdvertisement tbAdvertisement) throws Exception {
        tbAdvertisement.setIsDelete(0L);
        tbAdvertisement.setCreateTime(new Date());
        tbAdvertisement.setUpdateTime(tbAdvertisement.getCreateTime());
        int flag = advertisementMapper.insertSelective(tbAdvertisement);
        if (flag < 0) {
            throw new Exception("添加失败");
        }
    }

    @Override
    public void updateAdvertisement(TbAdvertisement tbAdvertisement) throws Exception {
        tbAdvertisement.setIsDelete(0L);
        tbAdvertisement.setUpdateTime(new Date());
        int flag = advertisementMapper.updateByPrimaryKeySelective(tbAdvertisement);
        if (flag < 0) {
            throw new Exception("更新失败");
        }
    }

    @Override
    public void removeAdvertisementById(String advertisementId) throws Exception {
        TbAdvertisement advertisement = advertisementMapper.selectByPrimaryKey(advertisementId);
        advertisement.setIsDelete(1L);
        advertisement.setUpdateTime(new Date());
        int flag = advertisementMapper.updateByPrimaryKeySelective(advertisement);
        if (flag < 0) {
            throw new Exception("删除失败");
        }
    }
}
