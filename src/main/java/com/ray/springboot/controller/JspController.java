package com.ray.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

@Controller
public class JspController {

    @RequestMapping(value = {"/index"})
    public String index(Map<String, Object> model){
        System.out.println("ddddd");
        model.put("time", new Date());
        model.put("message", "welcome to jsp page");

        return "index";

    }

    /**

     * 响应到JSP页面page1

     */

    /*@RequestMapping("/page1")

    public ModelAndView page1(){

// 页面位置 /WEB-INF/jsp/page/page.jsp

        ModelAndView mav = new ModelAndView("page/page1");

        mav.addObject("content", "this pageModel page/page1");

        return mav;

    }

    /**

     * 响应到JSP页面page1（可以直接使用Model封装内容，直接返回页面字符串）

     */

    /*@RequestMapping("/page2")

    public String page2(Model model){

// 页面位置 /WEB-INF/jsp/page/page.jsp

        model.addAttribute("content", hello + "（第二种）");

        return "page/page1";

    }*/

}
