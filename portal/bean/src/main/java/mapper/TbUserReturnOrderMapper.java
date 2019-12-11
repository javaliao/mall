package mapper;

import java.util.List;
import model.TbUserReturnOrder;
import model.TbUserReturnOrderExample;
import org.apache.ibatis.annotations.Param;

public interface TbUserReturnOrderMapper {
    int countByExample(TbUserReturnOrderExample example);

    int deleteByExample(TbUserReturnOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUserReturnOrder record);

    int insertSelective(TbUserReturnOrder record);

    List<TbUserReturnOrder> selectByExample(TbUserReturnOrderExample example);

    TbUserReturnOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUserReturnOrder record, @Param("example") TbUserReturnOrderExample example);

    int updateByExample(@Param("record") TbUserReturnOrder record, @Param("example") TbUserReturnOrderExample example);

    int updateByPrimaryKeySelective(TbUserReturnOrder record);

    int updateByPrimaryKey(TbUserReturnOrder record);
}