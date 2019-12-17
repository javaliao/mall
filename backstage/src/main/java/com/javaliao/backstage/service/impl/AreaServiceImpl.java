package com.javaliao.backstage.service.impl;

import cn.hutool.core.util.StrUtil;
import com.javaliao.backstage.bean.TbArea;
import com.javaliao.backstage.mapper.AreaMapper;
import com.javaliao.backstage.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Override
    public void getAreaList(ModelMap modelMap) {
        List<TbArea> tbAreas = areaMapper.selectAll();
        modelMap.put("tbAreas",tbAreas);
    }

    @Override
    public void areaSerach(TbArea area, ModelMap modelMap) {
        area.setIsDelete(0L);
        if(StrUtil.isBlank(area.getAreaName())){
            area.setAreaName(null);
        }
        List<TbArea> tbAreas = areaMapper.select(area);
        modelMap.put("tbAreas",tbAreas);
    }

    @Override
    public void getAreaById(String areaId, ModelMap modelMap) {
        TbArea tbArea = new TbArea();
        tbArea.setIsDelete(0L);
        TbArea area = areaMapper.selectOne(tbArea);
        modelMap.put("area",area);
    }

    @Override
    public void insertArea(TbArea area) throws Exception {
        area.setIsDelete(0L);
        area.setCreateTime(new Date());
        area.setUpdateTime(area.getCreateTime());
        int flag = areaMapper.insertSelective(area);
        if(flag < 0){
            throw new Exception("添加失败");
        }

    }

    @Override
    public void updateArea(TbArea area) throws Exception {
        area.setIsDelete(0L);
        area.setUpdateTime(new Date());
        int flag = areaMapper.updateByPrimaryKeySelective(area);
        if(flag < 0){
            throw new Exception("更新失败");
        }
    }

    @Override
    public void removeArea(String areaId) throws Exception {
        TbArea tbArea = areaMapper.selectByPrimaryKey(areaId);
        if(null == tbArea){
            throw new Exception("该地区不存在");
        }
        tbArea.setIsDelete(1L);
        tbArea.setUpdateTime(new Date());
        int flag = areaMapper.updateByPrimaryKeySelective(tbArea);
        if(flag < 0){
            throw new Exception("删除失败");
        }
    }
}
