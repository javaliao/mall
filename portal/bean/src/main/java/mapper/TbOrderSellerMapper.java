package mapper;

import java.util.List;
import model.TbOrderSeller;
import model.TbOrderSellerExample;
import org.apache.ibatis.annotations.Param;

public interface TbOrderSellerMapper {
    int countByExample(TbOrderSellerExample example);

    int deleteByExample(TbOrderSellerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderSeller record);

    int insertSelective(TbOrderSeller record);

    List<TbOrderSeller> selectByExample(TbOrderSellerExample example);

    TbOrderSeller selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOrderSeller record, @Param("example") TbOrderSellerExample example);

    int updateByExample(@Param("record") TbOrderSeller record, @Param("example") TbOrderSellerExample example);

    int updateByPrimaryKeySelective(TbOrderSeller record);

    int updateByPrimaryKey(TbOrderSeller record);
}