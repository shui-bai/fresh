package com.fresh.dao;

import com.fresh.bean.BankCard;
import com.fresh.bean.BankCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankCardMapper {
    long countByExample(BankCardExample example);

    int deleteByExample(BankCardExample example);

    int deleteByPrimaryKey(Integer cardId);

    int insert(BankCard record);

    int insertSelective(BankCard record);

    List<BankCard> selectByExample(BankCardExample example);

    BankCard selectByPrimaryKey(Integer cardId);

    int updateByExampleSelective(@Param("record") BankCard record, @Param("example") BankCardExample example);

    int updateByExample(@Param("record") BankCard record, @Param("example") BankCardExample example);

    int updateByPrimaryKeySelective(BankCard record);

    int updateByPrimaryKey(BankCard record);
}