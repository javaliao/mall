package com.javaliao.basic.mapper;

import com.javaliao.basic.model.TbAgreement;
import com.javaliao.basic.model.TbAgreementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAgreementMapper {
    int countByExample(TbAgreementExample example);

    int deleteByExample(TbAgreementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbAgreement record);

    int insertSelective(TbAgreement record);

    List<TbAgreement> selectByExampleWithBLOBs(TbAgreementExample example);

    List<TbAgreement> selectByExample(TbAgreementExample example);

    TbAgreement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbAgreement record, @Param("example") TbAgreementExample example);

    int updateByExampleWithBLOBs(@Param("record") TbAgreement record, @Param("example") TbAgreementExample example);

    int updateByExample(@Param("record") TbAgreement record, @Param("example") TbAgreementExample example);

    int updateByPrimaryKeySelective(TbAgreement record);

    int updateByPrimaryKeyWithBLOBs(TbAgreement record);

    int updateByPrimaryKey(TbAgreement record);
}