package com.example.kaoqin.entity;

import java.util.Date;

/**
 * 考勤
 * @author example
 * @date 2020/2/23 9:37 上午
 */
public class Check {

    /**
     * 记录ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 编号
     */
    private String number;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出勤时间
     */
    private Date checkInTime;

    /**
     * 退勤时间
     */
    private Date checkOutTime;

    private Double duration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
