package com.dounine.preys.ss.service;

import org.springframework.stereotype.Service;

@Service
public class IndexSerImpl implements IIndexSer {

    @Override
    public String prey() {
        return "SS";
    }
}
