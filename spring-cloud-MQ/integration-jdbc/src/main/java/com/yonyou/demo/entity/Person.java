package com.yonyou.demo.entity;

import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.*;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/9 14:12
 * @Description:
 */
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue()
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private Long age;

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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
