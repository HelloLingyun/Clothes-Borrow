package org.clothes.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.clothes.bean.Clothestable;
import org.clothes.bean.ClothestableExample;

public interface ClothestableMapper {
    long countByExample(ClothestableExample example);

    int deleteByExample(ClothestableExample example);

    int deleteByPrimaryKey(Integer clothesid);

    int insert(Clothestable record);

    int insertSelective(Clothestable record);

    List<Clothestable> selectByExample(ClothestableExample example);

    Clothestable selectByPrimaryKey(Integer clothesid);

    int updateByExampleSelective(@Param("record") Clothestable record, @Param("example") ClothestableExample example);

    int updateByExample(@Param("record") Clothestable record, @Param("example") ClothestableExample example);

    int updateByPrimaryKeySelective(Clothestable record);

    int updateByPrimaryKey(Clothestable record);
}