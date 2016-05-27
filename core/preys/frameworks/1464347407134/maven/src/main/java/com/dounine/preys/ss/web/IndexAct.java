package com.dounine.preys.ss.web;

import com.dounine.preys.ss.service.IIndexSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexAct {

    @Autowired
    private IIndexSer indexSer;
    
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView index(ModelMap modelMap) {
        modelMap.put("name",indexSer.prey());
        return new ModelAndView("/WEB-INF/views/index.jsp");
    }

}
