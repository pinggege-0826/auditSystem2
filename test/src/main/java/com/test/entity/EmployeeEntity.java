package com.test.entity;

/**
 * 员工实体
 */
public class EmployeeEntity {
    //id
    private int id;
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String sex;
    //地址
    private String location;


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
