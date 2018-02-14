package org.clothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**      
* 描述：   页面跳转控制器<br>
* 创建人：灵云<br>
* 创建时间：2018年2月14日 下午10:32:45   
* @version        
*/
@Controller
public class PageController {
	
	/**      
	* 描述：   显示首页<br>
	* 创建人：灵云<br>
	* 创建时间：2018年2月14日 下午10:42:08 
	*/
	@RequestMapping("initIndex.do")
	public  String showIndex(){
		return "index";
	}
		
	/**      
	* 描述：   要显示页面跳转<br>
	* 创建人：灵云<br>
	* 创建时间：2018年2月14日 下午10:42:38 
	*/
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	
	
	
	
	
	
}
