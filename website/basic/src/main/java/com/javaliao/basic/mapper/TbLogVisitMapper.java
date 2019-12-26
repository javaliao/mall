package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbLogVisit;
import com.javaliao.basic.model.TbLogVisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLogVisitMapper {
    int countByExample(TbLogVisitExample example);

    int deleteByExample(TbLogVisitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLogVisit record);

    int insertSelective(TbLogVisit record);

    List<TbLogVisit> selectByExample(TbLogVisitExample example);

    TbLogVisit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLogVisit record, @Param("example") TbLogVisitExample example);

    int updateByExample(@Param("record") TbLogVisit record, @Param("example") TbLogVisitExample example);

    int updateByPrimaryKeySelective(TbLogVisit record);

    int updateByPrimaryKey(TbLogVisit record);
}