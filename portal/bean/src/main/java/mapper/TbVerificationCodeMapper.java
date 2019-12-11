package mapper;

import java.util.List;
import model.TbVerificationCode;
import model.TbVerificationCodeExample;
import org.apache.ibatis.annotations.Param;

public interface TbVerificationCodeMapper {
    int countByExample(TbVerificationCodeExample example);

    int deleteByExample(TbVerificationCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbVerificationCode record);

    int insertSelective(TbVerificationCode record);

    List<TbVerificationCode> selectByExample(TbVerificationCodeExample example);

    TbVerificationCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbVerificationCode record, @Param("example") TbVerificationCodeExample example);

    int updateByExample(@Param("record") TbVerificationCode record, @Param("example") TbVerificationCodeExample example);

    int updateByPrimaryKeySelective(TbVerificationCode record);

    int updateByPrimaryKey(TbVerificationCode record);
}