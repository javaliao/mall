package mapper;

import java.util.List;
import model.TbFormProblem;
import model.TbFormProblemExample;
import org.apache.ibatis.annotations.Param;

public interface TbFormProblemMapper {
    int countByExample(TbFormProblemExample example);

    int deleteByExample(TbFormProblemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbFormProblem record);

    int insertSelective(TbFormProblem record);

    List<TbFormProblem> selectByExample(TbFormProblemExample example);

    TbFormProblem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbFormProblem record, @Param("example") TbFormProblemExample example);

    int updateByExample(@Param("record") TbFormProblem record, @Param("example") TbFormProblemExample example);

    int updateByPrimaryKeySelective(TbFormProblem record);

    int updateByPrimaryKey(TbFormProblem record);
}