package org.clothes.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.clothes.bean.Bigtypetable;
import org.clothes.bean.BigtypetableExample;

public interface BigtypetableMapper {
    long countByExample(BigtypetableExample example);

    int deleteByExample(BigtypetableExample example);

    int deleteByPrimaryKey(Integer bigtypeid);

    int insert(Bigtypetable record);

    int insertSelective(Bigtypetable record);

    List<Bigtypetable> selectByExample(BigtypetableExample example);

    Bigtypetable selectByPrimaryKey(Integer bigtypeid);

    int updateByExampleSelective(@Param("record") Bigtypetable record, @Param("example") BigtypetableExample example);

    int updateByExample(@Param("record") Bigtypetable record, @Param("example") BigtypetableExample example);

    int updateByPrimaryKeySelective(Bigtypetable record);

    int updateByPrimaryKey(Bigtypetable record);
}