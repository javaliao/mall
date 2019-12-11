package mapper;

import java.util.List;
import model.TbColumn;
import model.TbColumnExample;
import org.apache.ibatis.annotations.Param;

public interface TbColumnMapper {
    int countByExample(TbColumnExample example);

    int deleteByExample(TbColumnExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbColumn record);

    int insertSelective(TbColumn record);

    List<TbColumn> selectByExample(TbColumnExample example);

    TbColumn selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbColumn record, @Param("example") TbColumnExample example);

    int updateByExample(@Param("record") TbColumn record, @Param("example") TbColumnExample example);

    int updateByPrimaryKeySelective(TbColumn record);

    int updateByPrimaryKey(TbColumn record);
}