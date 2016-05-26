package com.dounine.hyaena.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;

/**
 * Created by huanghuanlai on 16/4/27.
 */

public class BaseAct {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseAct.class);
    @PostConstruct
    public void inits(){
        LOGGER.info("****  (hyaena-web) -> inits  ****");
    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public String add(){
        return "add";
    }

    @RequestMapping(value = "del",method = RequestMethod.GET)
    public String del(){
        return "del";
    }
    @RequestMapping(value = "edit",method = RequestMethod.GET)
    public String edit(){
        return "edit";
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public String list(){
        return "list";
    }
    @RequestMapping(value = "find",method = RequestMethod.GET)
    public String find(){
        return "find";
    }
}
