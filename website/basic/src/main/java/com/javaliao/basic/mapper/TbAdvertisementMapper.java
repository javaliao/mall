package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbAdvertisement;
import com.javaliao.basic.model.TbAdvertisementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdvertisementMapper {
    int countByExample(TbAdvertisementExample example);

    int deleteByExample(TbAdvertisementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbAdvertisement record);

    int insertSelective(TbAdvertisement record);

    List<TbAdvertisement> selectByExample(TbAdvertisementExample example);

    TbAdvertisement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbAdvertisement record, @Param("example") TbAdvertisementExample example);

    int updateByExample(@Param("record") TbAdvertisement record, @Param("example") TbAdvertisementExample example);

    int updateByPrimaryKeySelective(TbAdvertisement record);

    int updateByPrimaryKey(TbAdvertisement record);
}