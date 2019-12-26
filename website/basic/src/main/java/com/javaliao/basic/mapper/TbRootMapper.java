package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbRoot;
import com.javaliao.basic.model.TbRootExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRootMapper {
    int countByExample(TbRootExample example);

    int deleteByExample(TbRootExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRoot record);

    int insertSelective(TbRoot record);

    List<TbRoot> selectByExample(TbRootExample example);

    TbRoot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRoot record, @Param("example") TbRootExample example);

    int updateByExample(@Param("record") TbRoot record, @Param("example") TbRootExample example);

    int updateByPrimaryKeySelective(TbRoot record);

    int updateByPrimaryKey(TbRoot record);
}