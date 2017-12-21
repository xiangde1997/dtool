package cn.xym.dtool.controller;

import cn.xym.dtool.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DBAController {
    @Autowired
    private IStaffService staffService;

    @RequestMapping(value="/")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("admin/dba_add_field");

        return mv;
    }

}
