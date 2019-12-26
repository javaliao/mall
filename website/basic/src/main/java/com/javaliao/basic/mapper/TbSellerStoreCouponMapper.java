package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbSellerStoreCoupon;
import com.javaliao.basic.model.TbSellerStoreCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSellerStoreCouponMapper {
    int countByExample(TbSellerStoreCouponExample example);

    int deleteByExample(TbSellerStoreCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSellerStoreCoupon record);

    int insertSelective(TbSellerStoreCoupon record);

    List<TbSellerStoreCoupon> selectByExample(TbSellerStoreCouponExample example);

    TbSellerStoreCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSellerStoreCoupon record, @Param("example") TbSellerStoreCouponExample example);

    int updateByExample(@Param("record") TbSellerStoreCoupon record, @Param("example") TbSellerStoreCouponExample example);

    int updateByPrimaryKeySelective(TbSellerStoreCoupon record);

    int updateByPrimaryKey(TbSellerStoreCoupon record);
}