package org.clothes.service;

import java.util.List;

import org.clothes.bean.Bigtypetable;
import org.clothes.bean.BigtypetableExample;
import org.clothes.bean.Smalltypetable;
import org.clothes.bean.SmalltypetableExample;
import org.clothes.bean.SmalltypetableExample.Criteria;
import org.clothes.dao.BigtypetableMapper;
import org.clothes.dao.SmalltypetableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BigClothesTypeService {
	
	@Autowired
	private BigtypetableMapper bigtypetableMapper;
	@Autowired
	private SmalltypetableMapper smalltypetableMapper;
	
	/**      
	* 描述：   获取所有大分类列表信息<br>
	* 创建人：灵云<br>
	* 创建时间：2018年2月15日 下午11:38:09 
	*/
	public List<Bigtypetable> getBigTypeList(){
		BigtypetableExample example = new BigtypetableExample();
		example.setOrderByClause("BigtypeId asc");//升序排序	
		return bigtypetableMapper.selectByExample(example);
	}
	
	/**      
	* 描述：   根据大分类联动小分类<br>
	* 创建人：灵云<br>
	* 创建时间：2018年2月16日 上午12:20:31 
	*/
	public List<Smalltypetable> getSmallTypeListByBigCode(int bigCode){
		SmalltypetableExample example = new SmalltypetableExample();
		Criteria criteria=example.createCriteria();
		criteria.andBigtypeidEqualTo(bigCode);
		return smalltypetableMapper.selectByExample(example);
	}
	
	
	
	
	
	
	
	
	
	
	
}
