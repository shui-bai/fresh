package com.fresh.dao;

import com.fresh.bean.IdentityCard;
import com.fresh.bean.IdentityCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentityCardMapper {
    long countByExample(IdentityCardExample example);

    int deleteByExample(IdentityCardExample example);

    int deleteByPrimaryKey(Integer cardId);

    int insert(IdentityCard record);

    int insertSelective(IdentityCard record);

    List<IdentityCard> selectByExample(IdentityCardExample example);

    IdentityCard selectByPrimaryKey(Integer cardId);

    int updateByExampleSelective(@Param("record") IdentityCard record, @Param("example") IdentityCardExample example);

    int updateByExample(@Param("record") IdentityCard record, @Param("example") IdentityCardExample example);

    int updateByPrimaryKeySelective(IdentityCard record);

    int updateByPrimaryKey(IdentityCard record);
}