package com.fieldsignserver.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

@Controller
@RequestMapping(value="/admin")
public class LoginController {
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(@RequestParam("username") String username,@RequestParam("password") String password){
		Map result = new HashMap<String,String>();
		System.out.println("Username : "+username+", Password :"+password);
		result.put("result", "success");
		return new ModelAndView(new MappingJacksonJsonView(),result);
	}
}
