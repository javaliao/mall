package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbProductSpecifications;
import com.javaliao.basic.model.TbProductSpecificationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductSpecificationsMapper {
    int countByExample(TbProductSpecificationsExample example);

    int deleteByExample(TbProductSpecificationsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductSpecifications record);

    int insertSelective(TbProductSpecifications record);

    List<TbProductSpecifications> selectByExample(TbProductSpecificationsExample example);

    TbProductSpecifications selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductSpecifications record, @Param("example") TbProductSpecificationsExample example);

    int updateByExample(@Param("record") TbProductSpecifications record, @Param("example") TbProductSpecificationsExample example);

    int updateByPrimaryKeySelective(TbProductSpecifications record);

    int updateByPrimaryKey(TbProductSpecifications record);
}