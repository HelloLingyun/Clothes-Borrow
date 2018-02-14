package org.clothes.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.clothes.bean.Admintable;
import org.clothes.bean.AdmintableExample;

public interface AdmintableMapper {
    long countByExample(AdmintableExample example);

    int deleteByExample(AdmintableExample example);

    int deleteByPrimaryKey(Integer adminid);

    int insert(Admintable record);

    int insertSelective(Admintable record);

    List<Admintable> selectByExample(AdmintableExample example);

    Admintable selectByPrimaryKey(Integer adminid);

    int updateByExampleSelective(@Param("record") Admintable record, @Param("example") AdmintableExample example);

    int updateByExample(@Param("record") Admintable record, @Param("example") AdmintableExample example);

    int updateByPrimaryKeySelective(Admintable record);

    int updateByPrimaryKey(Admintable record);
}