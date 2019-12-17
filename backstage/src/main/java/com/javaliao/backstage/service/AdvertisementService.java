package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbAdvertisement;
import org.springframework.ui.ModelMap;

public interface AdvertisementService {
    void getAdvertisementList(ModelMap modelMap);

    void advertisementSearch(TbAdvertisement tbAdvertisement, ModelMap modelMap);

    void getAdvertisementById(String advertisementId, ModelMap modelMap);

    void insertAdvertisement(TbAdvertisement tbAdvertisement) throws Exception;

    void updateAdvertisement(TbAdvertisement tbAdvertisement) throws Exception;

    void removeAdvertisementById(String advertisementId) throws Exception;
}
