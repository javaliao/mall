package com.javaliao.backstage.service;

import com.javaliao.backstage.bean.TbSeller;
import org.springframework.ui.ModelMap;

public interface SellerService {

    void getSellerList(ModelMap modelMap);

    void sellerSearch(TbSeller tbSeller, ModelMap modelMap);

    void getSellerById(String sellerId, ModelMap modelMap);

    void removeSellerById(String sellerId) throws Exception;

    void updateSeller(TbSeller tbSeller) throws Exception;

    void insertSeller(TbSeller tbSeller) throws Exception;
}
