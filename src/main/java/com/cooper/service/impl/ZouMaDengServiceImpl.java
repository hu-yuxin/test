package com.cooper.service.impl;

import com.cooper.entity.ZouMaDeng;
import com.cooper.mapper.ZouMaDengMapper;
import com.cooper.service.ZouMaDengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZouMaDengServiceImpl implements ZouMaDengService {

    @Autowired
    private ZouMaDengMapper zouMaDengMapper;

    @Override
    public List<ZouMaDeng> getAll() {
        List<ZouMaDeng> zouMaDengs = zouMaDengMapper.selectAll();
        return zouMaDengs;
    }
}
