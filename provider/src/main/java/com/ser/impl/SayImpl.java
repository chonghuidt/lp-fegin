package com.ser.impl;

import com.ser.Say;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther lp
 * @date 2020/6/18 0018 15:45
 */
@RestController
public class SayImpl implements Say {
    @Override
    public String get() {
        return "hello";
    }
}
