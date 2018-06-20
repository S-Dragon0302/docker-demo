/**   
 * Copyright © 2018 公司名. All rights reserved.
 * 
 * @Title: HomeController.java 
 * @Prject: docker-demo
 * @Package: com.xsl.docker.controller 
 * @Description: TODO
 * @author: 许双龙   
 * @date: 2018年6月19日 下午4:22:06 
 * @version: V1.0   
 */
package com.xsl.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @ClassName: HomeController 
 * @Description: TODO
 * @author: 许双龙
 * @date: 2018年6月19日 下午4:22:06  
 */
@RestController
public class HomeController {
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
}
