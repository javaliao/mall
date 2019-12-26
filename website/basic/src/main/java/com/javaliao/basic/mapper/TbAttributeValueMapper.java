package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbAttributeValue;
import com.javaliao.basic.model.TbAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAttributeValueMapper {
    int countByExample(TbAttributeValueExample example);

    int deleteByExample(TbAttributeValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbAttributeValue record);

    int insertSelective(TbAttributeValue record);

    List<TbAttributeValue> selectByExample(TbAttributeValueExample example);

    TbAttributeValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbAttributeValue record, @Param("example") TbAttributeValueExample example);

    int updateByExample(@Param("record") TbAttributeValue record, @Param("example") TbAttributeValueExample example);

    int updateByPrimaryKeySelective(TbAttributeValue record);

    int updateByPrimaryKey(TbAttributeValue record);
}