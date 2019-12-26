package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbChannel;
import com.javaliao.basic.model.TbChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbChannelMapper {
    int countByExample(TbChannelExample example);

    int deleteByExample(TbChannelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbChannel record);

    int insertSelective(TbChannel record);

    List<TbChannel> selectByExample(TbChannelExample example);

    TbChannel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbChannel record, @Param("example") TbChannelExample example);

    int updateByExample(@Param("record") TbChannel record, @Param("example") TbChannelExample example);

    int updateByPrimaryKeySelective(TbChannel record);

    int updateByPrimaryKey(TbChannel record);
}