package com.dounine.hyaena.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by huanghuanlai on 16/3/29.
 */
@RestController
public class IndexAct {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexAct.class);

    @RequestMapping(value = {""})
    public ModelAndView index() {
        return  new ModelAndView("home/index");
    }

    @RequestMapping(value = {"**/content"}, method = RequestMethod.GET)
    public ModelAndView content(HttpServletRequest request) {
        return new ModelAndView("home/"+request.getRequestURI());
    }

    @RequestMapping(value = {"core/tmp"}, method = RequestMethod.GET)
    public ModelAndView tmp() {
        return new ModelAndView("home/core/tmp");
    }
}
