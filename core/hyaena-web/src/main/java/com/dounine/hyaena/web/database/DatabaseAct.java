package com.dounine.hyaena.web.database;

import com.dounine.hyaena.service.database.IDatabaseSer;
import com.dounine.hyaena.web.ResponseText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huanghuanlai on 16/5/24.
 */
@RestController
@RequestMapping("database")
public class DatabaseAct {

    @Autowired
    private IDatabaseSer databaseSer;

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public ResponseText list(){
        return new ResponseText(databaseSer.getAllObjects());
    }
}
