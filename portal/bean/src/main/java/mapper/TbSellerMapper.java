package mapper;

import java.util.List;
import model.TbSeller;
import model.TbSellerExample;
import org.apache.ibatis.annotations.Param;

public interface TbSellerMapper {
    int countByExample(TbSellerExample example);

    int deleteByExample(TbSellerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSeller record);

    int insertSelective(TbSeller record);

    List<TbSeller> selectByExample(TbSellerExample example);

    TbSeller selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    int updateByExample(@Param("record") TbSeller record, @Param("example") TbSellerExample example);

    int updateByPrimaryKeySelective(TbSeller record);

    int updateByPrimaryKey(TbSeller record);
}