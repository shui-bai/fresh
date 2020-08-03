package com.fresh.dao;

import com.fresh.bean.ShoppingTrolley;
import com.fresh.bean.ShoppingTrolleyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingTrolleyMapper {
    long countByExample(ShoppingTrolleyExample example);

    int deleteByExample(ShoppingTrolleyExample example);

    int deleteByPrimaryKey(Integer shppingTrolleyId);

    int insert(ShoppingTrolley record);

    int insertSelective(ShoppingTrolley record);

    List<ShoppingTrolley> selectByExample(ShoppingTrolleyExample example);

    ShoppingTrolley selectByPrimaryKey(Integer shppingTrolleyId);

    int updateByExampleSelective(@Param("record") ShoppingTrolley record, @Param("example") ShoppingTrolleyExample example);

    int updateByExample(@Param("record") ShoppingTrolley record, @Param("example") ShoppingTrolleyExample example);

    int updateByPrimaryKeySelective(ShoppingTrolley record);

    int updateByPrimaryKey(ShoppingTrolley record);
}