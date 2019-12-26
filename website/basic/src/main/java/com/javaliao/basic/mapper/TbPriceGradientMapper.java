package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbPriceGradient;
import com.javaliao.basic.model.TbPriceGradientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPriceGradientMapper {
    int countByExample(TbPriceGradientExample example);

    int deleteByExample(TbPriceGradientExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbPriceGradient record);

    int insertSelective(TbPriceGradient record);

    List<TbPriceGradient> selectByExample(TbPriceGradientExample example);

    TbPriceGradient selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbPriceGradient record, @Param("example") TbPriceGradientExample example);

    int updateByExample(@Param("record") TbPriceGradient record, @Param("example") TbPriceGradientExample example);

    int updateByPrimaryKeySelective(TbPriceGradient record);

    int updateByPrimaryKey(TbPriceGradient record);
}