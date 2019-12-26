package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbActivity;
import com.javaliao.basic.model.TbActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbActivityMapper {
    int countByExample(TbActivityExample example);

    int deleteByExample(TbActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbActivity record);

    int insertSelective(TbActivity record);

    List<TbActivity> selectByExample(TbActivityExample example);

    TbActivity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbActivity record, @Param("example") TbActivityExample example);

    int updateByExample(@Param("record") TbActivity record, @Param("example") TbActivityExample example);

    int updateByPrimaryKeySelective(TbActivity record);

    int updateByPrimaryKey(TbActivity record);
}