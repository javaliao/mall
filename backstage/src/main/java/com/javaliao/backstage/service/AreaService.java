package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbArea;
import org.springframework.ui.ModelMap;

public interface AreaService {

    void getAreaList(ModelMap modelMap);

    void areaSerach(TbArea area, ModelMap modelMap);

    void getAreaById(String areaId, ModelMap modelMap);

    void insertArea(TbArea area) throws Exception;

    void updateArea(TbArea area) throws Exception;

    void removeArea(String areaId) throws Exception;
}
