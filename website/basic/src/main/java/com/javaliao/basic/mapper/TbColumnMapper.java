package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbColumn;
import com.javaliao.basic.model.TbColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbColumnMapper {
    int countByExample(TbColumnExample example);

    int deleteByExample(TbColumnExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbColumn record);

    int insertSelective(TbColumn record);

    List<TbColumn> selectByExample(TbColumnExample example);

    TbColumn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbColumn record, @Param("example") TbColumnExample example);

    int updateByExample(@Param("record") TbColumn record, @Param("example") TbColumnExample example);

    int updateByPrimaryKeySelective(TbColumn record);

    int updateByPrimaryKey(TbColumn record);
}