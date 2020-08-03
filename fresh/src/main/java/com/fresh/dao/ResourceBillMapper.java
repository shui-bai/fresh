package com.fresh.dao;

import com.fresh.bean.ResourceBill;
import com.fresh.bean.ResourceBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceBillMapper {
    long countByExample(ResourceBillExample example);

    int deleteByExample(ResourceBillExample example);

    int deleteByPrimaryKey(Integer resId);

    int insert(ResourceBill record);

    int insertSelective(ResourceBill record);

    List<ResourceBill> selectByExample(ResourceBillExample example);

    ResourceBill selectByPrimaryKey(Integer resId);

    int updateByExampleSelective(@Param("record") ResourceBill record, @Param("example") ResourceBillExample example);

    int updateByExample(@Param("record") ResourceBill record, @Param("example") ResourceBillExample example);

    int updateByPrimaryKeySelective(ResourceBill record);

    int updateByPrimaryKey(ResourceBill record);
}