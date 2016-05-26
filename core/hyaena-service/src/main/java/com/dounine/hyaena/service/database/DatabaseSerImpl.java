package com.dounine.hyaena.service.database;

import com.dounine.hyaena.entity.capture.MDatabase;
import com.dounine.hyaena.service.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huanghuanlai on 16/5/24.
 */
@Service
public class DatabaseSerImpl extends ServiceImpl<MDatabase> implements IDatabaseSer {

    @Override
    public Long countObject() {
        return 9L;
    }

    public static void main(String[] args) {
        System.out.println("lake".hashCode());
    }

    @Override
    public List<MDatabase> getAllObjects() {
        List<MDatabase> databases = new ArrayList<>(0);
        databases.add(new MDatabase("id1","db2"));
        databases.add(new MDatabase("id2","mysql"));
        databases.add(new MDatabase("id3","oracle"));
        databases.add(new MDatabase("id4","sqlserver"));
        databases.add(new MDatabase("id5","mongodb"));
        databases.add(new MDatabase("id6","redis"));
        databases.add(new MDatabase("id7","h2"));
        return databases;
    }
}
