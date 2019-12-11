package mapper;

import java.util.List;
import model.TbSellerStore;
import model.TbSellerStoreExample;
import org.apache.ibatis.annotations.Param;

public interface TbSellerStoreMapper {
    int countByExample(TbSellerStoreExample example);

    int deleteByExample(TbSellerStoreExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSellerStore record);

    int insertSelective(TbSellerStore record);

    List<TbSellerStore> selectByExample(TbSellerStoreExample example);

    TbSellerStore selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSellerStore record, @Param("example") TbSellerStoreExample example);

    int updateByExample(@Param("record") TbSellerStore record, @Param("example") TbSellerStoreExample example);

    int updateByPrimaryKeySelective(TbSellerStore record);

    int updateByPrimaryKey(TbSellerStore record);
}