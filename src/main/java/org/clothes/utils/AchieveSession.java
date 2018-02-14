package org.clothes.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/** 
 * @author 灵云 
 * @Description 获取session
 * @date 创建时间 2017年10月30日 下午9:36:59 
**/
public class AchieveSession {
	public static HttpSession getSession() { 
	    HttpSession session = null; 
	    try { 
	        session = getRequest().getSession(); 
	    } catch (Exception e) {} 
	        return session; 
	} 

	public static HttpServletRequest getRequest() { 
	    ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes(); 
	    return attrs.getRequest(); 
	} 
}
