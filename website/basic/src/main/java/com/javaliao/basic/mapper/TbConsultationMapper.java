package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbConsultation;
import com.javaliao.basic.model.TbConsultationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbConsultationMapper {
    int countByExample(TbConsultationExample example);

    int deleteByExample(TbConsultationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbConsultation record);

    int insertSelective(TbConsultation record);

    List<TbConsultation> selectByExample(TbConsultationExample example);

    TbConsultation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbConsultation record, @Param("example") TbConsultationExample example);

    int updateByExample(@Param("record") TbConsultation record, @Param("example") TbConsultationExample example);

    int updateByPrimaryKeySelective(TbConsultation record);

    int updateByPrimaryKey(TbConsultation record);
}