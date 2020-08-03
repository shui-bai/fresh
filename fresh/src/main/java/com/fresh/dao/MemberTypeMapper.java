package com.fresh.dao;

import com.fresh.bean.MemberType;
import com.fresh.bean.MemberTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberTypeMapper {
    long countByExample(MemberTypeExample example);

    int deleteByExample(MemberTypeExample example);

    int insert(MemberType record);

    int insertSelective(MemberType record);

    List<MemberType> selectByExample(MemberTypeExample example);

    int updateByExampleSelective(@Param("record") MemberType record, @Param("example") MemberTypeExample example);

    int updateByExample(@Param("record") MemberType record, @Param("example") MemberTypeExample example);
}