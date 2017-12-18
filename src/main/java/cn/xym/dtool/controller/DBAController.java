package cn.xym.dtool.controller;

import cn.xym.dtool.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DBAController {
    @Autowired
    private IStaffService staffService;

    @RequestMapping(value="/")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value="/login")
    public String loginIndex(){
        return "login";
    }

    @RequestMapping(value="/loginAction",method= RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response){
        String loginname=request.getParameter("loginname");
        String loginpwd=request.getParameter("loginpwd");
        String result = staffService.login(loginname,loginpwd);
        ModelAndView mv=new ModelAndView();
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }


}
