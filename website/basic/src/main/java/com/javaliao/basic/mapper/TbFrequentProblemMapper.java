package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbFrequentProblem;
import com.javaliao.basic.model.TbFrequentProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFrequentProblemMapper {
    int countByExample(TbFrequentProblemExample example);

    int deleteByExample(TbFrequentProblemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbFrequentProblem record);

    int insertSelective(TbFrequentProblem record);

    List<TbFrequentProblem> selectByExampleWithBLOBs(TbFrequentProblemExample example);

    List<TbFrequentProblem> selectByExample(TbFrequentProblemExample example);

    TbFrequentProblem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbFrequentProblem record, @Param("example") TbFrequentProblemExample example);

    int updateByExampleWithBLOBs(@Param("record") TbFrequentProblem record, @Param("example") TbFrequentProblemExample example);

    int updateByExample(@Param("record") TbFrequentProblem record, @Param("example") TbFrequentProblemExample example);

    int updateByPrimaryKeySelective(TbFrequentProblem record);

    int updateByPrimaryKeyWithBLOBs(TbFrequentProblem record);

    int updateByPrimaryKey(TbFrequentProblem record);
}