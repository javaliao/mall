package mapper;

import java.util.List;
import model.TbArea;
import model.TbAreaExample;
import org.apache.ibatis.annotations.Param;

public interface TbAreaMapper {
    int countByExample(TbAreaExample example);

    int deleteByExample(TbAreaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbArea record);

    int insertSelective(TbArea record);

    List<TbArea> selectByExample(TbAreaExample example);

    TbArea selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbArea record, @Param("example") TbAreaExample example);

    int updateByExample(@Param("record") TbArea record, @Param("example") TbAreaExample example);

    int updateByPrimaryKeySelective(TbArea record);

    int updateByPrimaryKey(TbArea record);
}