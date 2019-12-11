package mapper;

import java.util.List;
import model.TbCustomerServiceEmployee;
import model.TbCustomerServiceEmployeeExample;
import org.apache.ibatis.annotations.Param;

public interface TbCustomerServiceEmployeeMapper {
    int countByExample(TbCustomerServiceEmployeeExample example);

    int deleteByExample(TbCustomerServiceEmployeeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustomerServiceEmployee record);

    int insertSelective(TbCustomerServiceEmployee record);

    List<TbCustomerServiceEmployee> selectByExample(TbCustomerServiceEmployeeExample example);

    TbCustomerServiceEmployee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCustomerServiceEmployee record, @Param("example") TbCustomerServiceEmployeeExample example);

    int updateByExample(@Param("record") TbCustomerServiceEmployee record, @Param("example") TbCustomerServiceEmployeeExample example);

    int updateByPrimaryKeySelective(TbCustomerServiceEmployee record);

    int updateByPrimaryKey(TbCustomerServiceEmployee record);
}