package com.fresh.dao;

import com.fresh.bean.PurchaseOrders;
import com.fresh.bean.PurchaseOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrdersMapper {
    long countByExample(PurchaseOrdersExample example);

    int deleteByExample(PurchaseOrdersExample example);

    int deleteByPrimaryKey(Integer purchaseId);

    int insert(PurchaseOrders record);

    int insertSelective(PurchaseOrders record);

    List<PurchaseOrders> selectByExample(PurchaseOrdersExample example);

    PurchaseOrders selectByPrimaryKey(Integer purchaseId);

    int updateByExampleSelective(@Param("record") PurchaseOrders record, @Param("example") PurchaseOrdersExample example);

    int updateByExample(@Param("record") PurchaseOrders record, @Param("example") PurchaseOrdersExample example);

    int updateByPrimaryKeySelective(PurchaseOrders record);

    int updateByPrimaryKey(PurchaseOrders record);
}