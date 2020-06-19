package com.ser;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "consumer")
public interface Csay {

    @PostMapping("/cget")
    public String cget();

}
