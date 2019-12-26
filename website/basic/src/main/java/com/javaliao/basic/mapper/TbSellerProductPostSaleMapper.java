package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbSellerProductPostSale;
import com.javaliao.basic.model.TbSellerProductPostSaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSellerProductPostSaleMapper {
    int countByExample(TbSellerProductPostSaleExample example);

    int deleteByExample(TbSellerProductPostSaleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSellerProductPostSale record);

    int insertSelective(TbSellerProductPostSale record);

    List<TbSellerProductPostSale> selectByExample(TbSellerProductPostSaleExample example);

    TbSellerProductPostSale selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSellerProductPostSale record, @Param("example") TbSellerProductPostSaleExample example);

    int updateByExample(@Param("record") TbSellerProductPostSale record, @Param("example") TbSellerProductPostSaleExample example);

    int updateByPrimaryKeySelective(TbSellerProductPostSale record);

    int updateByPrimaryKey(TbSellerProductPostSale record);
}