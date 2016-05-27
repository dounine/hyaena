package com.dounine.hyaena.search;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreySearch {

    private static File ROOT_FILE;
    private static List<Profile> PROFILE_LIST = new ArrayList<>(0);
    private static Map<String,List<Food>> MAP_FOODS;
    private static final String PROFILES = "profiles";
    private static final String[] modules = {"database", "service", "controller", "view"};

    static {
        init(null);
    }

    public static void init(String path){
        if(StringUtils.isBlank(path)){
            path = PreySearch.class.getResource("/").getPath();
            ROOT_FILE = new File(new File(path).getParentFile().getParentFile().getParentFile().getParentFile().getPath() + File.separator + "core/preys");
        }else{
            ROOT_FILE = new File(path);
        }

        File fileDir = FileUtils.getFile(ROOT_FILE, PROFILES);
        if(fileDir.exists()){
            PROFILE_LIST = new ArrayList<>(0);
            for (File file : fileDir.listFiles()) {
                try {
                    Profile profile = JSON.parseObject(FileUtils.readFileToString(file, Charset.defaultCharset()), Profile.class);
                    PROFILE_LIST.add(profile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static Map<String, List<Food>> initModules(){
        Map<String, List<Food>> keys = new HashMap<>();
        for (String module : modules) {
            keys.put(module, new ArrayList<>(0));
        }
        String kstr = "Keys";
        Class<Profile> profileClass = Profile.class;
        for (Profile profile : PROFILE_LIST) {
            for (String module : modules) {
                try {
                    Field field = profileClass.getDeclaredField(module + kstr);
                    field.setAccessible(true);
                    String[] ks = field.get(profile).toString().split(",");
                    for (String k : ks) {
                        if (StringUtils.isNotBlank(k) && !keys.get(module).contains(new Food(k))) {
                            keys.get(module).add(new Food(k));
                        }
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return keys;
    }

    public static Map<String, List<Food>> modules(){
        if(null==MAP_FOODS){
            MAP_FOODS = initModules();
        }
        return MAP_FOODS;
    }

    public static void main(String args[]){
        System.out.println(JSON.toJSONString(modules()));
    }

}
