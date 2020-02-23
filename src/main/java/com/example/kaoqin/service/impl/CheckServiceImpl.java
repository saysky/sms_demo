package com.example.kaoqin.service.impl;

import com.example.kaoqin.entity.Check;
import com.example.kaoqin.mapper.CheckMapper;
import com.example.kaoqin.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author example
 * @date 2020/2/23 9:48 上午
 */
@Service
public class CheckServiceImpl implements CheckService {

    @Autowired
    private CheckMapper checkMapper;

    @Override
    public int deleteById(Long id) {
        return checkMapper.deleteById(id);
    }

    @Override
    public int insert(Check check) {
        return checkMapper.insert(check);
    }

    @Override
    public Check findById(Long id) {
        return checkMapper.findById(id);
    }

    @Override
    public int update(Check check) {
        return checkMapper.update(check);
    }

    @Override
    public List<Check> findAll() {
        return checkMapper.findAll();
    }

    @Override
    public List<Check> findByName(String name) {
        return checkMapper.findByName(name);
    }
}
