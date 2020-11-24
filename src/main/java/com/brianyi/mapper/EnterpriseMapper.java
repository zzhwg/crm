package com.brianyi.mapper;

import com.brianyi.domain.Enterprise;
import com.brianyi.domain.EnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnterpriseMapper {
    long countByExample(EnterpriseExample example);

    int deleteByExample(EnterpriseExample example);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    List<Enterprise> selectByExample(EnterpriseExample example);

    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);
}