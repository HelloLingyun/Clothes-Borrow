package org.clothes.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.clothes.bean.Smalltypetable;
import org.clothes.bean.SmalltypetableExample;

public interface SmalltypetableMapper {
    long countByExample(SmalltypetableExample example);

    int deleteByExample(SmalltypetableExample example);

    int deleteByPrimaryKey(Integer smalltypeid);

    int insert(Smalltypetable record);

    int insertSelective(Smalltypetable record);

    List<Smalltypetable> selectByExample(SmalltypetableExample example);

    Smalltypetable selectByPrimaryKey(Integer smalltypeid);

    int updateByExampleSelective(@Param("record") Smalltypetable record, @Param("example") SmalltypetableExample example);

    int updateByExample(@Param("record") Smalltypetable record, @Param("example") SmalltypetableExample example);

    int updateByPrimaryKeySelective(Smalltypetable record);

    int updateByPrimaryKey(Smalltypetable record);
}