package com.dounine.hyaena.web.capture;

import com.dounine.hyaena.entity.capture.Nav;
import com.dounine.hyaena.service.database.IDatabaseSer;
import com.dounine.hyaena.web.ResponseText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huanghuanlai on 16/5/24.
 */
@RestController
@RequestMapping("capture")
public class CaptureAct {

    @Autowired
    private IDatabaseSer databaseSer;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView capture() {
        return  new ModelAndView("home/capture");
    }

    @RequestMapping(value = "navs",method = RequestMethod.GET)
    public ResponseText navs(){
        List<Nav> navs = new ArrayList<>(0);
        navs.add(new Nav("database",databaseSer.countObject()));
        navs.add(new Nav("service",6l));
        navs.add(new Nav("controller",6l));
        navs.add(new Nav("view",6l));
        return new ResponseText(navs);
    }
}
