package mapper;

import java.util.List;
import model.TbUserAttention;
import model.TbUserAttentionExample;
import org.apache.ibatis.annotations.Param;

public interface TbUserAttentionMapper {
    int countByExample(TbUserAttentionExample example);

    int deleteByExample(TbUserAttentionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbUserAttention record);

    int insertSelective(TbUserAttention record);

    List<TbUserAttention> selectByExample(TbUserAttentionExample example);

    TbUserAttention selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUserAttention record, @Param("example") TbUserAttentionExample example);

    int updateByExample(@Param("record") TbUserAttention record, @Param("example") TbUserAttentionExample example);

    int updateByPrimaryKeySelective(TbUserAttention record);

    int updateByPrimaryKey(TbUserAttention record);
}