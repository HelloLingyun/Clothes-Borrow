package org.clothes.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.clothes.bean.Majortable;
import org.clothes.bean.MajortableExample;

public interface MajortableMapper {
    long countByExample(MajortableExample example);

    int deleteByExample(MajortableExample example);

    int deleteByPrimaryKey(Integer depid);

    int insert(Majortable record);

    int insertSelective(Majortable record);

    List<Majortable> selectByExample(MajortableExample example);

    Majortable selectByPrimaryKey(Integer depid);

    int updateByExampleSelective(@Param("record") Majortable record, @Param("example") MajortableExample example);

    int updateByExample(@Param("record") Majortable record, @Param("example") MajortableExample example);

    int updateByPrimaryKeySelective(Majortable record);

    int updateByPrimaryKey(Majortable record);
}