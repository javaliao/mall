package mapper;

import java.util.List;
import model.TbProductParameterType;
import model.TbProductParameterTypeExample;
import org.apache.ibatis.annotations.Param;

public interface TbProductParameterTypeMapper {
    int countByExample(TbProductParameterTypeExample example);

    int deleteByExample(TbProductParameterTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductParameterType record);

    int insertSelective(TbProductParameterType record);

    List<TbProductParameterType> selectByExample(TbProductParameterTypeExample example);

    TbProductParameterType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductParameterType record, @Param("example") TbProductParameterTypeExample example);

    int updateByExample(@Param("record") TbProductParameterType record, @Param("example") TbProductParameterTypeExample example);

    int updateByPrimaryKeySelective(TbProductParameterType record);

    int updateByPrimaryKey(TbProductParameterType record);
}