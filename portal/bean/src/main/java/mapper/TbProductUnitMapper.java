package mapper;

import java.util.List;
import model.TbProductUnit;
import model.TbProductUnitExample;
import org.apache.ibatis.annotations.Param;

public interface TbProductUnitMapper {
    int countByExample(TbProductUnitExample example);

    int deleteByExample(TbProductUnitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProductUnit record);

    int insertSelective(TbProductUnit record);

    List<TbProductUnit> selectByExample(TbProductUnitExample example);

    TbProductUnit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProductUnit record, @Param("example") TbProductUnitExample example);

    int updateByExample(@Param("record") TbProductUnit record, @Param("example") TbProductUnitExample example);

    int updateByPrimaryKeySelective(TbProductUnit record);

    int updateByPrimaryKey(TbProductUnit record);
}