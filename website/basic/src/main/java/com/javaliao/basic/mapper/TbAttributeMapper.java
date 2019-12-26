package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbAttribute;
import com.javaliao.basic.model.TbAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAttributeMapper {
    int countByExample(TbAttributeExample example);

    int deleteByExample(TbAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbAttribute record);

    int insertSelective(TbAttribute record);

    List<TbAttribute> selectByExample(TbAttributeExample example);

    TbAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbAttribute record, @Param("example") TbAttributeExample example);

    int updateByExample(@Param("record") TbAttribute record, @Param("example") TbAttributeExample example);

    int updateByPrimaryKeySelective(TbAttribute record);

    int updateByPrimaryKey(TbAttribute record);
}