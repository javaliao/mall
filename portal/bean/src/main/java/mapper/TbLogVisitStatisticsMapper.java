package mapper;

import java.util.List;
import model.TbLogVisitStatistics;
import model.TbLogVisitStatisticsExample;
import org.apache.ibatis.annotations.Param;

public interface TbLogVisitStatisticsMapper {
    int countByExample(TbLogVisitStatisticsExample example);

    int deleteByExample(TbLogVisitStatisticsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLogVisitStatistics record);

    int insertSelective(TbLogVisitStatistics record);

    List<TbLogVisitStatistics> selectByExample(TbLogVisitStatisticsExample example);

    TbLogVisitStatistics selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLogVisitStatistics record, @Param("example") TbLogVisitStatisticsExample example);

    int updateByExample(@Param("record") TbLogVisitStatistics record, @Param("example") TbLogVisitStatisticsExample example);

    int updateByPrimaryKeySelective(TbLogVisitStatistics record);

    int updateByPrimaryKey(TbLogVisitStatistics record);
}