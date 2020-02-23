package com.example.kaoqin.mapper;

import com.example.kaoqin.entity.Check;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 考勤Mapper
 *
 * @author example
 * @date 2020-02-22 20:53
 */
@Mapper
public interface CheckMapper {

    /**
     * 根据ID删除
     *
     * @param id 考勤ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Long id);

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
    Check findById(@Param("id") Long id);

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
     * 根据姓名模糊查询
     * @return
     */
    List<Check> findByName(String name);
}
