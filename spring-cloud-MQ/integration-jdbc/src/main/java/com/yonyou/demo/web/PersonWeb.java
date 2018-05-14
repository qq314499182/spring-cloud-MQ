package com.yonyou.demo.web;

import com.yonyou.demo.entity.Person;
import com.yonyou.demo.mq.ProductSender;
import com.yonyou.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhaokep
 * @Date: 2018/5/9 15:57
 * @Description:
 */
@RestController
public class PersonWeb {

    @Autowired
    private PersonService service;

    @Autowired
    private ProductSender sender;

    @PostMapping
    public Person save(@RequestBody Person person){
        Person save = service.save(person);
        return save;
    }

    @GetMapping("/sendOrder")
    public void sendToOrder(){
        sender.sendToOrder();
    }

    @GetMapping("/sendStock")
    public void sendToStock(){
        sender.sendToStcok();
    }

    @GetMapping("/sendBase")
    public void sendToBase(){
        sender.sendToBase();
    }

    @GetMapping("/sendFanout")
    public void sendFanout(){
        sender.sendFanout();
    }
}
