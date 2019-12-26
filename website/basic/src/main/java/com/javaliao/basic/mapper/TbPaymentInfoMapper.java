package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbPaymentInfo;
import com.javaliao.basic.model.TbPaymentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPaymentInfoMapper {
    int countByExample(TbPaymentInfoExample example);

    int deleteByExample(TbPaymentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPaymentInfo record);

    int insertSelective(TbPaymentInfo record);

    List<TbPaymentInfo> selectByExample(TbPaymentInfoExample example);

    TbPaymentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbPaymentInfo record, @Param("example") TbPaymentInfoExample example);

    int updateByExample(@Param("record") TbPaymentInfo record, @Param("example") TbPaymentInfoExample example);

    int updateByPrimaryKeySelective(TbPaymentInfo record);

    int updateByPrimaryKey(TbPaymentInfo record);
}