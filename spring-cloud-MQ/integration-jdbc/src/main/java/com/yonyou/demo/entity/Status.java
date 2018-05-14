package com.yonyou.demo.entity;

import javax.persistence.*;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/9 14:22
 * @Description:
 */
@Entity
@Table(name = "PERSON_STATUS")
public class Status {

    @Id
    @GeneratedValue()
    @Column(name = "ID")
    private Long id;

    @Column(name = "P_STATUS")
    private String p_status = "new" ;

    @Column(name = "PERSON_ID")
    private Long personId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getP_status() {
        return p_status;
    }

    public void setP_status(String p_status) {
        this.p_status = p_status;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
