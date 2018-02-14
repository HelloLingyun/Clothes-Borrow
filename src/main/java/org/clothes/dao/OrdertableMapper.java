package org.clothes.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.clothes.bean.Ordertable;
import org.clothes.bean.OrdertableExample;

public interface OrdertableMapper {
    long countByExample(OrdertableExample example);

    int deleteByExample(OrdertableExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Ordertable record);

    int insertSelective(Ordertable record);

    List<Ordertable> selectByExample(OrdertableExample example);

    Ordertable selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Ordertable record, @Param("example") OrdertableExample example);

    int updateByExample(@Param("record") Ordertable record, @Param("example") OrdertableExample example);

    int updateByPrimaryKeySelective(Ordertable record);

    int updateByPrimaryKey(Ordertable record);
}