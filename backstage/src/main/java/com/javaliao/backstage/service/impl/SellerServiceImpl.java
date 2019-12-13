package com.javaliao.backstage.service.impl;

import com.javaliao.backstage.bean.TbSeller;
import com.javaliao.backstage.mapper.SellerMapper;
import com.javaliao.backstage.service.SellerService;
import com.javaliao.backstage.util.StringTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    SellerMapper sellerMapper;
    @Override
    public void getSellerList(ModelMap modelMap) {
        TbSeller tbSeller = new TbSeller();
        tbSeller.setIsDelete(0L);
        List<TbSeller> select = sellerMapper.select(tbSeller);
        modelMap.addAttribute("sellerList",select);
    }

    @Override
    public void sellerSearch(TbSeller tbSeller, ModelMap modelMap) {
        if(StringTool.isEmpty(tbSeller.getSellerName())){
            tbSeller.setSellerName(null);
        }
        if(StringTool.isEmpty(tbSeller.getLiaisonName())){
            tbSeller.setLiaisonName(null);
        }
        if(StringTool.isEmpty(tbSeller.getLiaisonPhone())){
            tbSeller.setLiaisonPhone(null);
        }
        tbSeller.setIsDelete(0L);
        List<TbSeller> select = sellerMapper.select(tbSeller);
        modelMap.addAttribute("sellerList",select);
    }

    @Override
    public void getSellerById(String sellerId, ModelMap modelMap) {
        TbSeller tbSeller = new TbSeller();
        tbSeller.setId(Long.valueOf(sellerId));
        tbSeller.setIsDelete(0L);
        TbSeller selectOne = sellerMapper.selectOne(tbSeller);
        modelMap.addAttribute("TbSeller",selectOne);
    }

    @Override
    public void removeSellerById(String sellerId) throws Exception {
        TbSeller tbSeller = new TbSeller();
        tbSeller.setId(Long.valueOf(sellerId));
        int delete = sellerMapper.delete(tbSeller);
        if(delete <= 0){
            throw new Exception("删除失败！");
        }
    }

    @Override
    public void updateSeller(TbSeller tbSeller) throws Exception {
        int i = sellerMapper.updateByPrimaryKey(tbSeller);
        if(i <= 0){
            throw new Exception("更新失败！");
        }
    }

    @Override
    public void insertSeller(TbSeller tbSeller) throws Exception {
        tbSeller.setIsDelete(0L);
        int insert = sellerMapper.insert(tbSeller);
        if(insert <= 0){
            throw new Exception("添加失败！");
        }
    }
}
