package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbUserCollections;
import com.javaliao.basic.model.TbUserCollectionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCollectionsMapper {
    int countByExample(TbUserCollectionsExample example);

    int deleteByExample(TbUserCollectionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUserCollections record);

    int insertSelective(TbUserCollections record);

    List<TbUserCollections> selectByExample(TbUserCollectionsExample example);

    TbUserCollections selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUserCollections record, @Param("example") TbUserCollectionsExample example);

    int updateByExample(@Param("record") TbUserCollections record, @Param("example") TbUserCollectionsExample example);

    int updateByPrimaryKeySelective(TbUserCollections record);

    int updateByPrimaryKey(TbUserCollections record);
}