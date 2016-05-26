package com.dounine.hyaena.search;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by huanghuanlai on 16/5/25.
 */
public class PreySearch {

    private static final File ROOT_FILE;
    static {
        String path = PreySearch.class.getResource("/").getPath();
        ROOT_FILE = new File(new File(path).getParentFile().getParentFile().getParentFile().getParentFile().getPath()+File.separator+"preys");
    }

    public static List<String> preyList(String name){
        List<String> preys = new ArrayList<>(0);


        return preys;
    }

    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        System.out.println((System.currentTimeMillis()+"").length());
        System.out.println((System.nanoTime()+"").length());
        System.out.println(ROOT_FILE.getAbsoluteFile());
    }
}
