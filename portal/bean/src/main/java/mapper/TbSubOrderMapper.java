package mapper;

import java.util.List;
import model.TbSubOrder;
import model.TbSubOrderExample;
import org.apache.ibatis.annotations.Param;

public interface TbSubOrderMapper {
    int countByExample(TbSubOrderExample example);

    int deleteByExample(TbSubOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSubOrder record);

    int insertSelective(TbSubOrder record);

    List<TbSubOrder> selectByExample(TbSubOrderExample example);

    TbSubOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSubOrder record, @Param("example") TbSubOrderExample example);

    int updateByExample(@Param("record") TbSubOrder record, @Param("example") TbSubOrderExample example);

    int updateByPrimaryKeySelective(TbSubOrder record);

    int updateByPrimaryKey(TbSubOrder record);
}