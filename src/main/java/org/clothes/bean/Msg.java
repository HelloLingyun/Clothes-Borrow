package org.clothes.bean;

import java.util.HashMap;
import java.util.Map;

/** 
 * @author 灵云 
 * @Description 通用返回类
 * @date 创建时间 2017年10月3日 上午10:54:30 
**/
public class Msg {
	//状态码 100(成功) 200(失败)
	private int codeSataic;
	//提示信息
	private String msg;
	//用户返回给浏览器的数据
	private Map<String,Object> extend = new HashMap<String,Object>();
	
	/**
	 * 
	 *@author 灵云
	 *@Describe 处理成功
	 *@return
	 */
	public static Msg success(){
		Msg result = new Msg();
		result.setCodeSataic(100);
		result.setMsg("处理成功");
		return result;
	}
	
	/**
	 * 
	 *@author 灵云
	 *@Describe 处理失败
	 *@return
	 */
	public static Msg failure(){
		Msg result = new Msg();
		result.setCodeSataic(200);
		result.setMsg("处理失败");
		return result;
	}
	
	/**
	 * 
	 *@author 灵云
	 *@Describe 添加返回数据
	 *@param key
	 *@param value
	 *@return
	 */
	public Msg add(String key,Object value){
		this.getExtend().put(key, value);
		return this;
	}
	
	public int getCodeSataic() {
		return codeSataic;
	}
	public void setCodeSataic(int codeSataic) {
		this.codeSataic = codeSataic;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
	
	
}
