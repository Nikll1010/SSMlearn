package com.nikll.entity;


import org.mybatis.spring.annotation.MapperScan;

import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2018/12/18 15:39
 * @Description:
 */
@MapperScan
public class Student {
    private int id;
    private int student_id;
    private String name;
    private int age;
    private String sex;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }




}
