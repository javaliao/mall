package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbShopChar;
import com.javaliao.basic.model.TbShopCharExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbShopCharMapper {
    int countByExample(TbShopCharExample example);

    int deleteByExample(TbShopCharExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbShopChar record);

    int insertSelective(TbShopChar record);

    List<TbShopChar> selectByExample(TbShopCharExample example);

    TbShopChar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbShopChar record, @Param("example") TbShopCharExample example);

    int updateByExample(@Param("record") TbShopChar record, @Param("example") TbShopCharExample example);

    int updateByPrimaryKeySelective(TbShopChar record);

    int updateByPrimaryKey(TbShopChar record);
}