package com.fresh.dao;

import com.fresh.bean.ResourceListDetails;
import com.fresh.bean.ResourceListDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceListDetailsMapper {
    long countByExample(ResourceListDetailsExample example);

    int deleteByExample(ResourceListDetailsExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(ResourceListDetails record);

    int insertSelective(ResourceListDetails record);

    List<ResourceListDetails> selectByExample(ResourceListDetailsExample example);

    ResourceListDetails selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") ResourceListDetails record, @Param("example") ResourceListDetailsExample example);

    int updateByExample(@Param("record") ResourceListDetails record, @Param("example") ResourceListDetailsExample example);

    int updateByPrimaryKeySelective(ResourceListDetails record);

    int updateByPrimaryKey(ResourceListDetails record);
}