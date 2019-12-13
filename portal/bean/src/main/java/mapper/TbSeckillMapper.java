package mapper;

import java.util.List;
import model.TbSeckill;
import model.TbSeckillExample;
import org.apache.ibatis.annotations.Param;

public interface TbSeckillMapper {
    int countByExample(TbSeckillExample example);

    int deleteByExample(TbSeckillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbSeckill record);

    int insertSelective(TbSeckill record);

    List<TbSeckill> selectByExample(TbSeckillExample example);

    TbSeckill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSeckill record, @Param("example") TbSeckillExample example);

    int updateByExample(@Param("record") TbSeckill record, @Param("example") TbSeckillExample example);

    int updateByPrimaryKeySelective(TbSeckill record);

    int updateByPrimaryKey(TbSeckill record);
}