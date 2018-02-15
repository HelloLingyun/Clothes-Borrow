package org.clothes.controller;

import java.util.List;

import org.clothes.bean.Bigtypetable;
import org.clothes.bean.Msg;
import org.clothes.bean.Smalltypetable;
import org.clothes.dao.BigtypetableMapper;
import org.clothes.service.BigClothesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddClothesController {

	@Autowired
	private  BigClothesTypeService bigClothesTypeService;
	
	@ResponseBody
	@RequestMapping("initClothesBigType.do")
	public List<Bigtypetable> initClothesBigType(){
		return bigClothesTypeService.getBigTypeList();
	}
	
	@ResponseBody
	@RequestMapping("initClothesSmallType.do")
	public List<Smalltypetable> initClothesSmallType(@RequestParam(value="bigCode")Integer bigCode){
		return bigClothesTypeService.getSmallTypeListByBigCode(bigCode);
	}
	
}
