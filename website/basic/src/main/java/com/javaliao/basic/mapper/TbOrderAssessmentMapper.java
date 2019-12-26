package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbOrderAssessment;
import com.javaliao.basic.model.TbOrderAssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderAssessmentMapper {
    int countByExample(TbOrderAssessmentExample example);

    int deleteByExample(TbOrderAssessmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderAssessment record);

    int insertSelective(TbOrderAssessment record);

    List<TbOrderAssessment> selectByExample(TbOrderAssessmentExample example);

    TbOrderAssessment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOrderAssessment record, @Param("example") TbOrderAssessmentExample example);

    int updateByExample(@Param("record") TbOrderAssessment record, @Param("example") TbOrderAssessmentExample example);

    int updateByPrimaryKeySelective(TbOrderAssessment record);

    int updateByPrimaryKey(TbOrderAssessment record);
}