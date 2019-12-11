package mapper;

import java.util.List;
import model.TbProvince;
import model.TbProvinceExample;
import org.apache.ibatis.annotations.Param;

public interface TbProvinceMapper {
    int countByExample(TbProvinceExample example);

    int deleteByExample(TbProvinceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbProvince record);

    int insertSelective(TbProvince record);

    List<TbProvince> selectByExample(TbProvinceExample example);

    TbProvince selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbProvince record, @Param("example") TbProvinceExample example);

    int updateByExample(@Param("record") TbProvince record, @Param("example") TbProvinceExample example);

    int updateByPrimaryKeySelective(TbProvince record);

    int updateByPrimaryKey(TbProvince record);
}