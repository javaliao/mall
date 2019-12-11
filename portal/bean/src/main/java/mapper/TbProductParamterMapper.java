package mapper;

import java.util.List;
import model.TbProductParamter;
import model.TbProductParamterExample;
import org.apache.ibatis.annotations.Param;

public interface TbProductParamterMapper {
    int countByExample(TbProductParamterExample example);

    int deleteByExample(TbProductParamterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductParamter record);

    int insertSelective(TbProductParamter record);

    List<TbProductParamter> selectByExample(TbProductParamterExample example);

    TbProductParamter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductParamter record, @Param("example") TbProductParamterExample example);

    int updateByExample(@Param("record") TbProductParamter record, @Param("example") TbProductParamterExample example);

    int updateByPrimaryKeySelective(TbProductParamter record);

    int updateByPrimaryKey(TbProductParamter record);
}