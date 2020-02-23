package com.example.kaoqin.service;

import com.example.kaoqin.entity.Check;

import java.util.List;

/**
 * @author example
 * @date 2020/2/23 9:48 上午
 */

public interface CheckService {

    /**
     * 根据ID删除
     *
     * @param id 考勤ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 添加
     *
     * @param check 考勤
     * @return 影响行数
     */
    int insert(Check check);

    /**
     * 根据ID查询
     *
     * @param id 考勤ID
     * @return 考勤
     */
    Check findById(Long id);

    /**
     * 更新
     *
     * @param check 考勤
     * @return 影响行数
     */
    int update(Check check);

    /**
     * 获得考勤列表
     *
     * @return 考勤列表
     */
    List<Check> findAll();

    /**
     * 获得考勤列表
     *
     * @return 考勤列表
     */
    List<Check> findByName(String name);
}
