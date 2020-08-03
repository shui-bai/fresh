package com.fresh.dao;

import com.fresh.bean.SeniorMember;
import com.fresh.bean.SeniorMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeniorMemberMapper {
    long countByExample(SeniorMemberExample example);

    int deleteByExample(SeniorMemberExample example);

    int deleteByPrimaryKey(Integer seniorId);

    int insert(SeniorMember record);

    int insertSelective(SeniorMember record);

    List<SeniorMember> selectByExample(SeniorMemberExample example);

    SeniorMember selectByPrimaryKey(Integer seniorId);

    int updateByExampleSelective(@Param("record") SeniorMember record, @Param("example") SeniorMemberExample example);

    int updateByExample(@Param("record") SeniorMember record, @Param("example") SeniorMemberExample example);

    int updateByPrimaryKeySelective(SeniorMember record);

    int updateByPrimaryKey(SeniorMember record);
}