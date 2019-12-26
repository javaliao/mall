package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbProductParameterType;
import com.javaliao.basic.model.TbProductParameterTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductParameterTypeMapper {
    int countByExample(TbProductParameterTypeExample example);

    int deleteByExample(TbProductParameterTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductParameterType record);

    int insertSelective(TbProductParameterType record);

    List<TbProductParameterType> selectByExample(TbProductParameterTypeExample example);

    TbProductParameterType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductParameterType record, @Param("example") TbProductParameterTypeExample example);

    int updateByExample(@Param("record") TbProductParameterType record, @Param("example") TbProductParameterTypeExample example);

    int updateByPrimaryKeySelective(TbProductParameterType record);

    int updateByPrimaryKey(TbProductParameterType record);
}