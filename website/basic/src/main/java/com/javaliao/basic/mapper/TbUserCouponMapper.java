package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbUserCoupon;
import com.javaliao.basic.model.TbUserCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCouponMapper {
    int countByExample(TbUserCouponExample example);

    int deleteByExample(TbUserCouponExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUserCoupon record);

    int insertSelective(TbUserCoupon record);

    List<TbUserCoupon> selectByExample(TbUserCouponExample example);

    TbUserCoupon selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUserCoupon record, @Param("example") TbUserCouponExample example);

    int updateByExample(@Param("record") TbUserCoupon record, @Param("example") TbUserCouponExample example);

    int updateByPrimaryKeySelective(TbUserCoupon record);

    int updateByPrimaryKey(TbUserCoupon record);
}