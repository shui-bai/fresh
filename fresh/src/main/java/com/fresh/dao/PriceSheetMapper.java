package com.fresh.dao;

import com.fresh.bean.PriceSheet;
import com.fresh.bean.PriceSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceSheetMapper {
    long countByExample(PriceSheetExample example);

    int deleteByExample(PriceSheetExample example);

    int deleteByPrimaryKey(Integer priceSheetId);

    int insert(PriceSheet record);

    int insertSelective(PriceSheet record);

    List<PriceSheet> selectByExample(PriceSheetExample example);

    PriceSheet selectByPrimaryKey(Integer priceSheetId);

    int updateByExampleSelective(@Param("record") PriceSheet record, @Param("example") PriceSheetExample example);

    int updateByExample(@Param("record") PriceSheet record, @Param("example") PriceSheetExample example);

    int updateByPrimaryKeySelective(PriceSheet record);

    int updateByPrimaryKey(PriceSheet record);
}