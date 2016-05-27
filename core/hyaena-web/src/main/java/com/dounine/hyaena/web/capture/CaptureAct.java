package com.dounine.hyaena.web.capture;

import com.dounine.hyaena.entity.capture.Nav;
import com.dounine.hyaena.search.Food;
import com.dounine.hyaena.search.PreySearch;
import com.dounine.hyaena.service.database.IDatabaseSer;
import com.dounine.hyaena.web.ResponseText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by huanghuanlai on 16/5/24.
 */
@RestController
@RequestMapping("capture")
public class CaptureAct {

    static {
        System.out.println(new File(CaptureAct.class.getResource("/").getPath()).getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getPath() + "/core/preys");
        PreySearch.init(new File(CaptureAct.class.getResource("/").getPath()).getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getPath() + "/core/preys");
    }

    @Autowired
    private IDatabaseSer databaseSer;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView capture() {
        return  new ModelAndView("home/capture");
    }

    @RequestMapping(value = "navs",method = RequestMethod.GET)
    public ResponseText navs(){
        List<Nav> navs = new ArrayList<>(0);
        Map<String,List<Food>> mapFoods =  PreySearch.modules();
        navs.add(new Nav("database",Long.parseLong(""+mapFoods.get("database").size())));
        navs.add(new Nav("service",Long.parseLong(""+mapFoods.get("service").size())));
        navs.add(new Nav("controller",Long.parseLong(""+mapFoods.get("controller").size())));
        navs.add(new Nav("view",Long.parseLong(""+mapFoods.get("view").size())));
        return new ResponseText(navs);
    }

    @RequestMapping(value = "{module}/list",method = RequestMethod.GET)
    public ResponseText modules(@PathVariable String module){
        return new ResponseText(PreySearch.modules().get(module));
    }
}
