package com.controller;



import com.ser.Csay;

import com.ser.Say;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @auther lp
 * @date 2020/6/18 0018 15:55
 */
@RestController
public class ConsumerController  {

   @Resource
   Say say;

   @GetMapping("/get")

    public String cget() {
        return say.get();
    }
}