package com.yonyou.demo.service;

import com.yonyou.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/9 15:53
 * @Description:
 */
@Repository
public interface PersonService extends JpaRepository<Person,Long> {
}
