package com.fresh.dao;

import com.fresh.bean.RegionTab;
import com.fresh.bean.RegionTabExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegionTabMapper {
    long countByExample(RegionTabExample example);

    int deleteByExample(RegionTabExample example);

    int deleteByPrimaryKey(Integer regionId);

    int insert(RegionTab record);

    int insertSelective(RegionTab record);

    List<RegionTab> selectByExample(RegionTabExample example);

    RegionTab selectByPrimaryKey(Integer regionId);

    int updateByExampleSelective(@Param("record") RegionTab record, @Param("example") RegionTabExample example);

    int updateByExample(@Param("record") RegionTab record, @Param("example") RegionTabExample example);

    int updateByPrimaryKeySelective(RegionTab record);

    int updateByPrimaryKey(RegionTab record);
}