package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbProductCategory;
import com.javaliao.basic.model.TbProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductCategoryMapper {
    int countByExample(TbProductCategoryExample example);

    int deleteByExample(TbProductCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductCategory record);

    int insertSelective(TbProductCategory record);

    List<TbProductCategory> selectByExample(TbProductCategoryExample example);

    TbProductCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductCategory record, @Param("example") TbProductCategoryExample example);

    int updateByExample(@Param("record") TbProductCategory record, @Param("example") TbProductCategoryExample example);

    int updateByPrimaryKeySelective(TbProductCategory record);

    int updateByPrimaryKey(TbProductCategory record);
}